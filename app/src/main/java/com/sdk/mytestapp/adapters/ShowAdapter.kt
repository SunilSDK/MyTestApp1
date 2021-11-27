package com.sdk.readyassist.ui.bookService.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.os.Build
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.sdk.mytestapp.R
import java.util.*
import kotlin.collections.ArrayList


class ShowAdapter :

    RecyclerView.Adapter<ShowViewHolder>() {
    private var lastPosition = -1
    var itemsFilterList = ArrayList<String>()
    private lateinit var context: Context
    private val items = ArrayList<String>()
    private lateinit var item: String

    fun setItems(items: ArrayList<String>) {
        this.items.clear()
        this.items.addAll(items)
        itemsFilterList=items
          notifyDataSetChanged()
    }

    fun clearItems() {
        this.items.clear()
        this.items.clear()
        itemsFilterList=items
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview_creator, parent, false)

        context = parent.context
        return ShowViewHolder(view)
    }
    override fun getItemCount(): Int {
        return itemsFilterList.size
    }
    private fun getItem(index: Int): String {
        return itemsFilterList[index]
    }
    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    @SuppressLint("SetTextI18n", "SimpleDateFormat")
    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {


        item = itemsFilterList[position]
        Log.d("Sunil",item.toString())

        val stringBuilder1 = StringBuilder()

        }

    }

class ShowViewHolder(itemView: View)
    : RecyclerView.ViewHolder(itemView) {

}