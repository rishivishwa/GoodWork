package com.example.goodwork

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan

object Utils {

    fun changeTextColorInSentence(sentence: String, targetText: String, color: Int): SpannableString {
        val spannable = SpannableString(sentence)

        val startIndex = sentence.indexOf(targetText)
        if (startIndex != -1) {
            val endIndex = startIndex + targetText.length
            val colorSpan = ForegroundColorSpan(color)
            spannable.setSpan(colorSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            val styleSpan = StyleSpan(Typeface.BOLD)
            spannable.setSpan(styleSpan, startIndex, endIndex, SpannableString.SPAN_INCLUSIVE_INCLUSIVE)

        }

        return spannable
    }
//    fun changeTextSizeInSentence(originalText: CharSequence, targetSentence: String, textSizeSp: Int): CharSequence {
//        val spannableString = SpannableString(originalText)
//        val startIndex = originalText.indexOf(targetSentence)
//
//        if (startIndex != -1) {
//            val endIndex = startIndex + targetSentence.length
//            spannableString.setSpan(
//                AbsoluteSizeSpan(textSizeSp, true),
//                startIndex,
//                endIndex,
//                SpannableString.SPAN_INCLUSIVE_INCLUSIVE
//            )
//        }
//
//        return spannableString
//    }
//    fun makeTextBoldInSentence(originalText: CharSequence, targetSentence: String): CharSequence {
//        val spannableStringBuilder = SpannableStringBuilder(originalText)
//        val startIndex = originalText.indexOf(targetSentence)
//
//        if (startIndex != -1) {
//            val endIndex = startIndex + targetSentence.length
//            val styleSpan = StyleSpan(Typeface.BOLD)
//            spannableStringBuilder.setSpan(styleSpan, startIndex, endIndex, SpannableString.SPAN_INCLUSIVE_INCLUSIVE)
//        }
//
//        return spannableStringBuilder
//    }
}