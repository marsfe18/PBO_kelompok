﻿# INGFO PENTING
 id dari form itu gabungan dari kodeprov kodekab periode
 id dari perusahaan itu gabungan dari id form sama index, misal ada form kosongan trus ditambahin 1 perusahaan maka id perusahaanya "idform"+"0"

DatabaseFormPerusahaan buat akses tabel FormPerusahaan didatabase
DatabasePerusahaan ----------------------sama------------------------

buat edit dan save form kalo didalemnya ada perusahaan maka didalem sintaks save/edit (FormPerusahaan) save/edit juga perusahaan tapi cukup make DatabasePerusahaan, ga perlu bikin query sql lagi buat update perusahaan (query updatenya di dalem DatabasePerusahaan)
