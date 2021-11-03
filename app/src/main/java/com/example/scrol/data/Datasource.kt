package com.example.scrol.data

import com.example.scrol.R
import com.example.scrol.model.Months

class Datasource {


        fun loadMonths(): List<Months> {
            return listOf<Months>(
                Months(R.string.month1),
                Months(R.string.month2),
                Months(R.string.month3),
                Months(R.string.month4),
                Months(R.string.month5),
                Months(R.string.month6),
                Months(R.string.month7),
                Months(R.string.month8),
                Months(R.string.month9),
                Months(R.string.month10),
                Months(R.string.month11),
                Months(R.string.month12)
            )
    }
}