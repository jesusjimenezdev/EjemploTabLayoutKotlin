package jesus.net.ejemplotablayoutkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var viewPager: ViewPager? = null
    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabs)

        configurarViewPager()
        tabLayout?.setupWithViewPager(viewPager)

        configurarIconos()
    }

    fun configurarViewPager() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PrimerFragment(), "Primer Fragmento")
        adapter.addFragment(PrimerFragment(), "Segundo Fragmento")
        adapter.addFragment(PrimerFragment(), "Tercer Fragmento")

        viewPager?.adapter = adapter
    }

    fun configurarIconos() {
        tabLayout?.getTabAt(0)!!.setIcon(R.drawable.ic_android_black_24dp)
        tabLayout?.getTabAt(1)!!.setIcon(R.drawable.ic_backup_black_24dp)
        tabLayout?.getTabAt(2)!!.setIcon(R.drawable.ic_battery_charging_20_black_24dp)
    }
}
