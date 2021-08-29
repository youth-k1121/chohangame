# 丁半ゲーム
## 遊び方
1. 半/丁のボタンが表示されます。この時点で2つのダイスの出目が決まっています。
1. 半/丁のどちらかのボタンを押します。
1. 正解かどうか表示されます。
1. リトライを押すと1に戻ります。

# モジュール構成
## app
アプリ全体をまとめるモジュール

### ActivityNavigators
各featureモジュールで定義した画面遷移I/Fの実装をする

実装したオブジェクトは `ChoHanGameApplication.onCreate` で `NavigationRegistry` に追加する

## 各feature
各機能のモジュール

画面(Fragment)ごとにパッケージを分ける

### Activity
AppCompatActivityを拡張

Fragment間の遷移を実装する

### Navigation
他Activityへの遷移関数を定義するためのI/F

appモジュールで実装し、navigationモジュールから取得する

### Fragment
UIを構築する

画面状態の保持や動作についてはViewModelに任せる

### ViewModel
UIの状態保持・およびユーザーアクションに対応する動作の呼び出しをする

## uiModel
UIのためにモデリングされたクラス群

### UiModel
画面表示に用いるデータクラス

## uiCommon
各feature共通で使うリソースを配置する

## navigation
feature間遷移用オブジェクトの管理

### NavigationRegistry
appモジュールで実装した遷移関数を保持し、featureモジュールに提供するためのオブジェクト

[参考サイト](https://engineering.mercari.com/blog/entry/2019-12-04-100000/)

## usecase
UIとビジネスロジックの仲介をする

### UseCase
ビジネスロジックの操作とI/O処理の呼び出し

## domainModel
モデリングしたドメインオブジェクトをまとめる
