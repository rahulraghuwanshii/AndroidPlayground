package com.rahulraghuwanshi.androidplayground.recyclerview_with_video_player
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.google.android.exoplayer2.MediaItem
//import com.google.android.exoplayer2.SimpleExoPlayer
//import com.google.android.exoplayer2.ui.PlayerView
//import com.rahulraghuwanshi.androidplayground.R
//
//class VideoAdapter(private val videoList: List<VideoItem>) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
//        return VideoViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
//        holder.bind(videoList[position])
//    }
//
//    override fun getItemCount(): Int {
//        return videoList.size
//    }
//
//    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val playerView: PlayerView = itemView.findViewById(R.id.player_view)
//        private var player: SimpleExoPlayer? = null
//
//        fun bind(videoItem: VideoItem) {
//            player = SimpleExoPlayer.Builder(itemView.context).build()
//            playerView.player = player
//
//            val mediaItem = MediaItem.fromUri(videoItem.videoUrl)
//            player?.setMediaItem(mediaItem)
//            player?.prepare()
//            player?.playWhenReady = false
//        }
//
//        fun releasePlayer() {
//            player?.release()
//            player = null
//        }
//    }
//
//    override fun onViewRecycled(holder: VideoViewHolder) {
//        super.onViewRecycled(holder)
//        holder.releasePlayer()
//    }
//}
