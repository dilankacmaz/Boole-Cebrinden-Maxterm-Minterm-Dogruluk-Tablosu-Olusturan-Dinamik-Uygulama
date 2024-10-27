


	import java.io.IOException;



	public class _21010310033_main {

		public static void main(String[] args) throws IOException {
			_21010310033_DosyaOkuma yeni = new _21010310033_DosyaOkuma();
			yeni.dosyaOkuma();
			_21010310033_dogrulukTablosu.dogrulukTablosu(yeni.denklem);
			_21010310033_Minterm.minterm(yeni.degiskenler);
			_21010310033_Maxterm.maxterm(yeni.degiskenler);
			
			
		}

	}

