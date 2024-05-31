package com.example.shayari

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayari.model.ShayariModel
import com.example.shayari.ui.theme.primaryLight

@Composable
@Preview
fun PreviewToolBar(modifier: Modifier = Modifier) {
    MainToolBar(title = "Category", onBackClick = {})
}

@Composable
fun MainToolBar(
    title: String = "Category",
    onBackClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.size(45.dp)
                .clickable {
                           onBackClick.invoke()
                },
            colors = CardDefaults.cardColors(
                containerColor = primaryLight,
            ),
            shape = CircleShape,
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.back_arrow),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = title, color = Color.White,
            fontWeight = FontWeight(700),
            fontSize = 24.sp
        )
    }
}

fun getList() : List<ShayariModel> {
    val shayariData = listOf(
        ShayariModel(
            title = "Love",
            list = listOf(
                "तेरी मुस्कुराहट की चाहत में, बीती ये जिंदगी हमारी।",
                "दिल को सुकून मिलता है, तेरी बाहों में आके।",
                "प्यार वो नहीं जो जीने का सहारा दे, प्यार वो है जो मरने का बहाना दे।",
                "चाँद लम्हे गुजर गए तेरे साथ, अब याद में भी तेरी बातें गुजरती हैं।",
                "तेरे बिना ज़िंदगी से कोई शिकवा तो नहीं, तेरे बिना ज़िंदगी भी लेकिन ज़िंदगी नहीं।",
                "तुम ही हो मेरी मोहब्बत की मंज़िल, तुम्हारे बिना ज़िंदगी बेकार है।",
                "मेरी ज़िंदगी का मकसद तुम हो, मेरी हर खुशी का राज़ तुम हो।",
                "प्यार एक खूबसूरत एहसास है, जो हर किसी के बस की बात नहीं।",
                "तेरे आने से मेरी दुनिया महकी, तेरे जाने से मेरी दुनिया वीराना हो गया।",
                "तेरे प्यार में जीना है, तेरे प्यार में मर जाना है।"
            )
        ),
        ShayariModel(
            title = "Friendship",
            list = listOf(
                "दोस्ती में न कोई रूठ कर जाए, दोस्ती टूटने से पहले टूट जाए।",
                "ज़िंदगी में हर पल मुस्कुराते रहो, दोस्ती की चाहत में हमेशा सजते रहो।",
                "दोस्ती वो जज़्बा है जो इंसान को इंसान बनाता है।",
                "तुम्हारे बिना ज़िंदगी अधूरी सी लगती है, दोस्ती में ये डोर थोड़ी कमज़ोर सी लगती है।",
                "दोस्ती में कोई हक़ नहीं होता, बस समझदारी का रिश्ता होता है।",
                "दोस्ती वो नहीं जो दोस्ती में बस लफ़्जों में हो, दोस्ती वो है जो हर पल दिल में हो।",
                "दोस्ती की अहमियत समझो, ये ज़िंदगी का अनमोल रिश्ता है।",
                "सच्चा दोस्त मिलना बहुत मुश्किल है, मगर मिल जाए तो उसकी कदर करो।",
                "दोस्ती ज़िंदगी का एक अहमियत भरा हिस्सा है, इसे संभाल के रखना।",
                "दोस्ती एक ऐसा रिश्ता है जो हर सुख दुख में साथ देता है।"
            )
        ),
        ShayariModel(
            title = "Life",
            list = listOf(
                "ज़िंदगी एक किताब है, हर पल को जीने की चाहत है।",
                "ज़िंदगी का सफर खूबसूरत है, बस जीने का जज़्बा होना चाहिए।",
                "हर पल में खुशी ढूँढो, ज़िंदगी अपनी है जी भर के जीयो।",
                "ज़िंदगी को जीने का मज़ा तब है, जब अपने साथ अपने हो।",
                "ज़िंदगी के हर मोड़ पर कुछ नया सीखने को मिलता है।",
                "ज़िंदगी को जीने का मकसद है खुश रहना।",
                "ज़िंदगी एक ऐसा सफर है, जहाँ हर पल को जीना पड़ता है।",
                "ज़िंदगी एक रंगमंच है, हम सब अपनी अपनी किरदार में हैं।",
                "ज़िंदगी का हर पल खूबसूरत है, बस जीने का अंदाज़ आना चाहिए।",
                "ज़िंदगी को खुद से प्यार करना सीखो, सब कुछ आसान हो जाएगा।"
            )
        ),
        ShayariModel(
            title = "Sad",
            list = listOf(
                "दर्द का रिश्ता दिल से है, हर पल बस उदासी सी है।",
                "दिल के अरमान आँसुओं में बह गए, हम वफ़ा करके भी तन्हा रह गए।",
                "तेरी यादों का एहसास अब भी है, बस तू ही नहीं है।",
                "रात भर जागते हैं तेरी यादों में, बस तेरी बातें ही हमारी रातों को सुकून देती हैं।",
                "आँसुओं का सिलसिला रुका नहीं, तेरे जाने का ग़म मिटा नहीं।",
                "ज़िंदगी से प्यार करते थे, अब ज़िंदगी ही बोझ लगती है।",
                "दिल तो उदास है ही, पर चेहरा भी इसका गवाह बन गया है।",
                "तेरे बिन जीना मुश्किल है, ये बात तू नहीं समझेगा।",
                "मिट्टी से बना था इंसान, फिर क्यों मिट्टी में मिलने से डरता है।",
                "तेरी यादों का सहारा है, बस तू ही नहीं है।"
            )
        ),
        ShayariModel(
            title = "Inspirational",
            list = listOf(
                "मुश्किलों से घबरा कर रास्ते नहीं बदलते, हौसला रखो तो मंजिल जरूर मिलती है।",
                "सपने वो नहीं जो हम सोते हुए देखते हैं, सपने वो हैं जो हमें सोने नहीं देते।",
                "ज़िंदगी में हार तब होती है, जब इंसान अपने हौसले को हार जाता है।",
                "सफलता का राज़ है मेहनत, बस लगन से अपना काम करते रहो।",
                "असली जीत तब होती है, जब आप हार कर भी अपने लक्ष्य को पा लेते हो।",
                "ज़िंदगी जीने का मज़ा तब आता है, जब अपनी मंजिल अपने दम पर पाते हैं।",
                "हर दिन एक नई शुरुआत है, बस हौसला और विश्वास रखना है।",
                "उम्मीद वो ताकत है जो ज़िंदगी को आगे बढ़ाती है।",
                "सफर खूबसूरत है, बस मंजिल तक पहुंचने का जज़्बा रखना है।",
                "मुश्किलें आती हैं ज़िंदगी में, पर यही तो जीने का मज़ा है।"
            )
        )
    )
    return shayariData
}