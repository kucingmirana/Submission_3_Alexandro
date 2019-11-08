package com.example.submission_3_alexandro;

import android.os.Parcel;

import java.util.ArrayList;

public class FilmData {
    private static String[] filmNames = {
            "A Star Is Born",
            "AQUAMAN",
            "The Avengers : Infinity War",
            "Bird Box",
            "Bohemian Rhapsody",
            "Bumbble Bee",
            "Creed 2",
            "DEADPOOL",
            "How To Train Your Dragon : The Hidden World",
            "GLASS"
    };

    private static String[] filmDuration = {
            "2 Hour",
            "1 Hour",
            "3 Hour",
            "2 Hour",
            "2 Hour",
            "1 Hour",
            "2 Hour",
            "4 Hour",
            "3 Hour",
            "2 Hour"
    };

    private static String[] filmRelease = {
            "May 10, 2018",
            "Oct 2, 2019",
            "May 19, 2017",
            "Aug 10, 2016",
            "May 15, 2019",
            "Mar 12, 2018",
            "Des 10, 2018",
            "Jan 5, 2018",
            "Feb 13, 2017",
            "Aug 14, 2018"
    };

    private static String[] filmDetails = {
            "Carl, the Invoker, is a ranged intelligence hero who is very difficult to master. He is unique in that he possesses a total of 14 abilities in his arsenal; three of them - Quas, Wex, and Exort - are reagents and one is his special ultimate Invoke. The three abilities he learns throughout leveling up can have three instances, which serve as the basic ingredients or components for him to create a new ability using his ultimate. Once the reagents or elements are combined, he can invoke one out of ten different abilities. All of his invoked abilities are capable of a multitude of actions, from damaging enemies to aiding his allies, and even saving himself from danger. His three reagents can be upgraded up to level 7 which determines the power and potency of his invoked abilities, making it more powerful than an ordinary spell. Because of this, he can be played in almost any role possible. Invoker can be a carry, semi-carry, ganker, pusher, initiator or even support.",
            "Lina, the Slayer, is a ranged Intelligence hero, adept at destroying enemy heroes quickly by delivering massive bursts of magical damage, making her one of the most effective gankers in the game. She possesses immense damaging capabilities all throughout the game, but is very fragile. Two of her fiery spells are her main source of damage, Dragon Slave sends a wave of fire to burn enemies in her path while Light Strike Array stuns them with a concentrated pillar of solar flame. Each of her spells deals great damage early on and has a low cooldown. Her Fiery Soul bolsters her attack and movement speed every time she casts a spell, which gives her scaling damage for the later game. Laguna Blade, her ultimate, is her ace in the hole. Lina fires off a huge bolt of lightning at a single target, dealing colossal damage",
            "Lion, the Demon Witch, is a ranged intelligence hero, most commonly played as a support, who serves as a powerful offensive spellcaster. While exceptionally frail and vulnerable at all stages of the game due to his low health pool, armor, and movement speed, he has a tremendous amount of disabling and nuking power, allowing him to provide the necessary lockdown and burst damage to his team to bring down elusive and shifty enemies. Earth Spike is an area-of-effect line-based stun that also deals a moderate amount of damage. If Lion uses it at max level combined with his Hex, which briefly transfigures an enemy into a harmless critter, he can disable a single opponent for almost 7 seconds, more than enough time to bring down a lone enemy, especially if an ally is present. His ultimate, Finger of Death, serves as a powerful nuke and his primary source of burst damage to aid him in his endeavors.",
            "Krobelus, the Death Prophet, is a ranged intelligence hero who excels at pushing lanes. She is often played in the mid lane, since her Crypt Swarm gives her strong magic damage that can be spammed to her heart's content. As she levels her ultimate, Exorcism, Death Prophet can deal a huge amount of damage to towers and heroes alike, while healing at the end of the duration. If Exorcism's own heal isn't enough, she still has Spirit Siphon which drains health based on the target's health and can even be used on multiple targets at the same time. Finally, her Silence gives her a powerful tool to disable enemy casters and heroes that rely on escape abilities. Because she can deal large amounts of damage over time with her ultimate and Crypt Swarm, Death Prophet is mostly built as a tank, to ensure she can continue to stay in the fight.",
            "Jakiro the Twin Head Dragon is a ranged intelligence hero who utilizes the powers of ice and fire with powerful linear area spells. He can freeze enemies in place with Ice Path, or slow them down with Dual Breath. He is capable of dealing heavy damage throughout the game by locking enemies inside his Macropyre, and provides great pushing power with Liquid Fire.",
            "Leshrac, the Tormented Soul, is a ranged intelligence hero who is known for his ability to put out a tremendous amount of area magical damage. His array of spells makes him a dangerous foe to stand around, as he can disable and nuke down anyone who dares to stand against him. Split Earth is an area stun that, after a delay, will stun all enemies in its radius while dealing damage. Diabolic Edict is a damage-over-time spell that deals physical damage, corroding all enemies near Leshrac. Unlike most other spells, it can also affect buildings, making Leshrac a very powerful tower killer who can push very effectively.",
            "Ezalor the Keeper of the Light is a ranged intelligence hero famous for his reputation as a one-man support team. Supporting his allies in need, and pushing unguarded lanes with ease, Ezalor is a very valuable ally for any team. Having a variety of useful abilities, he can channel a powerful globe of intense light that can heavily damage an army of enemy creeps in the lane, allowing for an easy push. He can also restore mana and reduce cooldown for himself and his allies as well as blind his enemies with an intense light that also damages and displaces them. His Ultimate hypnotizes enemies in an AoE periodically, allowing his allies to follow over with their attacks around this immensely powerful crowd control.",
            "Ethreain, the Lich, is a ranged intelligence hero that uses his abilities to slow his enemies down with his ice-based attacks, as well as giving a boost to ally defenses, and serves as a great teamfight ganker with his powerful ultimate. His Frost Shield bolsters his team's defenses with a damage-absorbing shield while releasing slowing pulses of ice to either deter enemies or catch up to them in a chase. Lone enemies he can disable and pull closer to himself with his Sinister Gaze, potentially pulling the target to their own demise.",
            "Enigma is a ranged intelligence hero who uses his abilities to cripple his enemies, supported by a seemingly inexhaustible army of creeps. His fearsome abilities can bind entire teams under his might. Enigma is also a formidable jungler and pusher owing to his ability to create creeps.",
            "Aiushtha the Enchantress is a ranged intelligence hero who uses her abilities to push through lanes and gank with relative ease. Enchantress works well as a jungler in the early game, as it maximizes the effectiveness of her Enchant and Untouchable abilities. On first glance, she may be just a support, serving her allies with powerful heals, creep abilities and slows, but as time goes on, her power increases and once she has her ultimate, Enchantress' regular attacks are strong enough to kill most heroes with a couple of attacks, if they stand far enough, and make her a potential carry."
    };

    private static int[] filmImages = {
            R.drawable.poster_a_star,
            R.drawable.poster_aquaman,
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_birdbox,
            R.drawable.poster_bohemian,
            R.drawable.poster_bumblebee,
            R.drawable.poster_creed,
            R.drawable.poster_deadpool,
            R.drawable.poster_dragon,
            R.drawable.poster_glass
    };

    static ArrayList<Film> getListData() {
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position < filmNames.length; position++) {
            Film hero = new Film(Parcel.obtain());
            hero.setName(filmNames[position]);
            hero.setDetail(filmDetails[position]);
            hero.setPhoto(filmImages[position]);
            list.add(hero);
        }
        return list;
    }
}
