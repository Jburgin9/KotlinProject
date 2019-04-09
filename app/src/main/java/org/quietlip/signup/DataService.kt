package org.quietlip.signup

import org.quietlip.signup.model.Category
import org.quietlip.signup.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(Product("Devslopes Beanie Black", "$18", "hat01"),
        Product("Devslopes Beanie White", "$18", "hat01"),
        Product("Devslopes Snapback White", "$18", "hat01"),
        Product("Devslopes Snapback Black", "$18", "hat01"))

    val hoodies = listOf(Product("Devslopes Hoodie Gray", "$24", "hoodie01"),
        listOf(Product("Devslopes Hoodie Black", "$24", "hoodie02"),
            listOf(Product("Devslopes Hoodie White", "$24", "hoodie03"))))

    val shirts = listOf(Product("Devslopes Shirt Black", "$18", "shirt01"),
        listOf(Product("Devslopes Shirt White", "$18", "shirt02"),
            listOf(Product("Devslopes Shirt Red", "$18", "shirt03"))))
}