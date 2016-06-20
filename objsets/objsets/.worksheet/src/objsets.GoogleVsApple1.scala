package objsets

object GoogleVsApple1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(120); 
  val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus");System.out.println("""google  : List[String] = """ + $show(google ));$skip(69); 
  val apple = List("ios", "iOS", "iphone", "iPhone", "ipad", "iPad");System.out.println("""apple  : List[String] = """ + $show(apple ));$skip(59); 

  lazy val googleTweets: TweetSet = TweetReader.allTweets;System.out.println("""googleTweets: => objsets.TweetSet""")}
  //lazy val appleTweets: TweetSet = TweetReader.allTweets.filter(tw => apple.exists(e => tw.text.contains(e)))
  
  /**
   * A list of all tweets mentioning a keyword from either apple or google,
   * sorted by the number of retweets.
   */
    // lazy val trending: TweetList = (googleTweets.union(appleTweets)).descendingByRetweet
}
