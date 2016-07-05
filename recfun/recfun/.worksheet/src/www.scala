object www {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  println("Welcome to the Scala worksheet");$skip(32); 
	val nums = 1 ::2 ::3 ::4 ::Nil;System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(37); 
	val qq= Nil.::(4).::(3).::(2).::(1);System.out.println("""qq  : List[Int] = """ + $show(qq ));$skip(9); val res$0 = 
	3::nums;System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
