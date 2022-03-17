package br.digitalhouse.tablayoutaula

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabsAdapter (fragmentoManager : FragmentManager) : FragmentPagerAdapter (fragmentoManager){

    var listaDeFragmentos : MutableList<Fragment> = mutableListOf()
    //lateinit var listaDeTitulos : MutableList<String>


    fun add(fragmento : Fragment, titulo : String){
       this.listaDeFragmentos.add(fragmento)
       //this.listaDeTitulos.add(titulo)
    }

    override fun getCount(): Int {
        return listaDeFragmentos.size
    }

    override fun getItem(position: Int): Fragment {
        return listaDeFragmentos.get(position)
    }

}