# main.py
# coincollecter's main function
import coin_collecter as cc

from model import barcode_reader as br

global coin_collecter # coin_collecter
global connection # connection to server
global barcode_reader # barcode reader


coin_collecter = cc.CoinCollecter()
barcode_reader = br.BarcodeReader()    
# connection need to add


print(coin_collecter)

      

while True:
    print("메뉴를 선택하세요:")
    select = input()

    if select == "1":
        flag = False;
        print("카메라 앞에 바코드를 위치하여 주세요")
        for i in range(5):
            barcode_reader.take_picture()
            flag, number = barcode_reader.parse_barcode()

            if flag == True:
                break
            
        if flag == False:
            print("인식에 실패했습니다")
        else :
            print("바코드: " + number)
    else :
        print("input err")
