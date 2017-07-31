# -*- coding: utf-8 -*-
# Generated by Django 1.10 on 2016-12-06 17:18
from __future__ import unicode_literals

from django.conf import settings
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
    ]

    operations = [
        migrations.CreateModel(
            name='Course',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('tag', models.CharField(max_length=10)),
                ('name', models.CharField(max_length=50)),
                ('description', models.CharField(max_length=300)),
                ('members', models.ManyToManyField(to=settings.AUTH_USER_MODEL)),
            ],
        ),
        migrations.CreateModel(
            name='University',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=50)),
                ('photo', models.ImageField(default=0, upload_to=b'static/universityimages')),
                ('description', models.CharField(max_length=300)),
                ('website', models.CharField(default=b'/', max_length=300)),
                ('members', models.ManyToManyField(to=settings.AUTH_USER_MODEL)),
            ],
        ),
        migrations.AddField(
            model_name='course',
            name='university',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='UniversitiesApp.University'),
        ),
    ]