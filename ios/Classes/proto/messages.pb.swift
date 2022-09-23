// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: proto/messages.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

enum Proto_BluetoothState: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case unsupported // = 0
  case poweredOff // = 1
  case poweredOn // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .unsupported
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unsupported
    case 1: self = .poweredOff
    case 2: self = .poweredOn
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unsupported: return 0
    case .poweredOff: return 1
    case .poweredOn: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Proto_BluetoothState: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Proto_BluetoothState] = [
    .unsupported,
    .poweredOff,
    .poweredOn,
  ]
}

#endif  // swift(>=4.2)

struct Proto_Advertisement {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var uuid: Proto_UUID {
    get {return _uuid ?? Proto_UUID()}
    set {_uuid = newValue}
  }
  /// Returns true if `uuid` has been explicitly set.
  var hasUuid: Bool {return self._uuid != nil}
  /// Clears the value of `uuid`. Subsequent reads from it will return its default value.
  mutating func clearUuid() {self._uuid = nil}

  var rssi: Int32 = 0

  var connectable: Bool {
    get {return _connectable ?? false}
    set {_connectable = newValue}
  }
  /// Returns true if `connectable` has been explicitly set.
  var hasConnectable: Bool {return self._connectable != nil}
  /// Clears the value of `connectable`. Subsequent reads from it will return its default value.
  mutating func clearConnectable() {self._connectable = nil}

  var data: Data = Data()

  var localName: String {
    get {return _localName ?? String()}
    set {_localName = newValue}
  }
  /// Returns true if `localName` has been explicitly set.
  var hasLocalName: Bool {return self._localName != nil}
  /// Clears the value of `localName`. Subsequent reads from it will return its default value.
  mutating func clearLocalName() {self._localName = nil}

  var manufacturerSpecificData: Data = Data()

  var serviceDatas: [Proto_ServiceData] = []

  var serviceUuids: [Proto_UUID] = []

  var solicitedServiceUuids: [Proto_UUID] = []

  var txPowerLevel: Int32 {
    get {return _txPowerLevel ?? 0}
    set {_txPowerLevel = newValue}
  }
  /// Returns true if `txPowerLevel` has been explicitly set.
  var hasTxPowerLevel: Bool {return self._txPowerLevel != nil}
  /// Clears the value of `txPowerLevel`. Subsequent reads from it will return its default value.
  mutating func clearTxPowerLevel() {self._txPowerLevel = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uuid: Proto_UUID? = nil
  fileprivate var _connectable: Bool? = nil
  fileprivate var _localName: String? = nil
  fileprivate var _txPowerLevel: Int32? = nil
}

struct Proto_Peripheral {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Int64 = 0

  var maximumWriteLength: Int32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Proto_GattService {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Int64 = 0

  var uuid: Proto_UUID {
    get {return _uuid ?? Proto_UUID()}
    set {_uuid = newValue}
  }
  /// Returns true if `uuid` has been explicitly set.
  var hasUuid: Bool {return self._uuid != nil}
  /// Clears the value of `uuid`. Subsequent reads from it will return its default value.
  mutating func clearUuid() {self._uuid = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uuid: Proto_UUID? = nil
}

struct Proto_GattCharacteristic {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Int64 = 0

  var uuid: Proto_UUID {
    get {return _uuid ?? Proto_UUID()}
    set {_uuid = newValue}
  }
  /// Returns true if `uuid` has been explicitly set.
  var hasUuid: Bool {return self._uuid != nil}
  /// Clears the value of `uuid`. Subsequent reads from it will return its default value.
  mutating func clearUuid() {self._uuid = nil}

  var canRead: Bool = false

  var canWrite: Bool = false

  var canWriteWithoutResponse: Bool = false

  var canNotify: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uuid: Proto_UUID? = nil
}

struct Proto_GattDescriptor {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Int64 = 0

  var uuid: Proto_UUID {
    get {return _uuid ?? Proto_UUID()}
    set {_uuid = newValue}
  }
  /// Returns true if `uuid` has been explicitly set.
  var hasUuid: Bool {return self._uuid != nil}
  /// Clears the value of `uuid`. Subsequent reads from it will return its default value.
  mutating func clearUuid() {self._uuid = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uuid: Proto_UUID? = nil
}

struct Proto_UUID {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var value: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Proto_ServiceData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var uuid: Proto_UUID {
    get {return _uuid ?? Proto_UUID()}
    set {_uuid = newValue}
  }
  /// Returns true if `uuid` has been explicitly set.
  var hasUuid: Bool {return self._uuid != nil}
  /// Clears the value of `uuid`. Subsequent reads from it will return its default value.
  mutating func clearUuid() {self._uuid = nil}

  var data: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uuid: Proto_UUID? = nil
}

struct Proto_BluetoothLowEnergyException {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var message: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Proto_BluetoothState: @unchecked Sendable {}
extension Proto_Advertisement: @unchecked Sendable {}
extension Proto_Peripheral: @unchecked Sendable {}
extension Proto_GattService: @unchecked Sendable {}
extension Proto_GattCharacteristic: @unchecked Sendable {}
extension Proto_GattDescriptor: @unchecked Sendable {}
extension Proto_UUID: @unchecked Sendable {}
extension Proto_ServiceData: @unchecked Sendable {}
extension Proto_BluetoothLowEnergyException: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "proto"

extension Proto_BluetoothState: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "BLUETOOTH_STATE_UNSUPPORTED"),
    1: .same(proto: "BLUETOOTH_STATE_POWERED_OFF"),
    2: .same(proto: "BLUETOOTH_STATE_POWERED_ON"),
  ]
}

extension Proto_Advertisement: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Advertisement"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "uuid"),
    2: .same(proto: "rssi"),
    3: .same(proto: "connectable"),
    4: .same(proto: "data"),
    5: .standard(proto: "local_name"),
    6: .standard(proto: "manufacturer_specific_data"),
    7: .standard(proto: "service_datas"),
    8: .standard(proto: "service_uuids"),
    9: .standard(proto: "solicited_service_uuids"),
    10: .standard(proto: "tx_power_level"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._uuid) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self.rssi) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self._connectable) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self._localName) }()
      case 6: try { try decoder.decodeSingularBytesField(value: &self.manufacturerSpecificData) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.serviceDatas) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.serviceUuids) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.solicitedServiceUuids) }()
      case 10: try { try decoder.decodeSingularInt32Field(value: &self._txPowerLevel) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._uuid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.rssi != 0 {
      try visitor.visitSingularInt32Field(value: self.rssi, fieldNumber: 2)
    }
    try { if let v = self._connectable {
      try visitor.visitSingularBoolField(value: v, fieldNumber: 3)
    } }()
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 4)
    }
    try { if let v = self._localName {
      try visitor.visitSingularStringField(value: v, fieldNumber: 5)
    } }()
    if !self.manufacturerSpecificData.isEmpty {
      try visitor.visitSingularBytesField(value: self.manufacturerSpecificData, fieldNumber: 6)
    }
    if !self.serviceDatas.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.serviceDatas, fieldNumber: 7)
    }
    if !self.serviceUuids.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.serviceUuids, fieldNumber: 8)
    }
    if !self.solicitedServiceUuids.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.solicitedServiceUuids, fieldNumber: 9)
    }
    try { if let v = self._txPowerLevel {
      try visitor.visitSingularInt32Field(value: v, fieldNumber: 10)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_Advertisement, rhs: Proto_Advertisement) -> Bool {
    if lhs._uuid != rhs._uuid {return false}
    if lhs.rssi != rhs.rssi {return false}
    if lhs._connectable != rhs._connectable {return false}
    if lhs.data != rhs.data {return false}
    if lhs._localName != rhs._localName {return false}
    if lhs.manufacturerSpecificData != rhs.manufacturerSpecificData {return false}
    if lhs.serviceDatas != rhs.serviceDatas {return false}
    if lhs.serviceUuids != rhs.serviceUuids {return false}
    if lhs.solicitedServiceUuids != rhs.solicitedServiceUuids {return false}
    if lhs._txPowerLevel != rhs._txPowerLevel {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_Peripheral: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Peripheral"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .standard(proto: "maximum_write_length"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularInt32Field(value: &self.maximumWriteLength) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularInt64Field(value: self.id, fieldNumber: 1)
    }
    if self.maximumWriteLength != 0 {
      try visitor.visitSingularInt32Field(value: self.maximumWriteLength, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_Peripheral, rhs: Proto_Peripheral) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.maximumWriteLength != rhs.maximumWriteLength {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_GattService: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GattService"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "uuid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._uuid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularInt64Field(value: self.id, fieldNumber: 1)
    }
    try { if let v = self._uuid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_GattService, rhs: Proto_GattService) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs._uuid != rhs._uuid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_GattCharacteristic: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GattCharacteristic"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "uuid"),
    3: .standard(proto: "can_read"),
    4: .standard(proto: "can_write"),
    5: .standard(proto: "can_write_without_response"),
    6: .standard(proto: "can_notify"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._uuid) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.canRead) }()
      case 4: try { try decoder.decodeSingularBoolField(value: &self.canWrite) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.canWriteWithoutResponse) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.canNotify) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularInt64Field(value: self.id, fieldNumber: 1)
    }
    try { if let v = self._uuid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.canRead != false {
      try visitor.visitSingularBoolField(value: self.canRead, fieldNumber: 3)
    }
    if self.canWrite != false {
      try visitor.visitSingularBoolField(value: self.canWrite, fieldNumber: 4)
    }
    if self.canWriteWithoutResponse != false {
      try visitor.visitSingularBoolField(value: self.canWriteWithoutResponse, fieldNumber: 5)
    }
    if self.canNotify != false {
      try visitor.visitSingularBoolField(value: self.canNotify, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_GattCharacteristic, rhs: Proto_GattCharacteristic) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs._uuid != rhs._uuid {return false}
    if lhs.canRead != rhs.canRead {return false}
    if lhs.canWrite != rhs.canWrite {return false}
    if lhs.canWriteWithoutResponse != rhs.canWriteWithoutResponse {return false}
    if lhs.canNotify != rhs.canNotify {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_GattDescriptor: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GattDescriptor"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "uuid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._uuid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.id != 0 {
      try visitor.visitSingularInt64Field(value: self.id, fieldNumber: 1)
    }
    try { if let v = self._uuid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_GattDescriptor, rhs: Proto_GattDescriptor) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs._uuid != rhs._uuid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_UUID: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UUID"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.value.isEmpty {
      try visitor.visitSingularStringField(value: self.value, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_UUID, rhs: Proto_UUID) -> Bool {
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_ServiceData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ServiceData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "uuid"),
    2: .same(proto: "data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._uuid) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._uuid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_ServiceData, rhs: Proto_ServiceData) -> Bool {
    if lhs._uuid != rhs._uuid {return false}
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Proto_BluetoothLowEnergyException: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BluetoothLowEnergyException"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "message"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.message) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Proto_BluetoothLowEnergyException, rhs: Proto_BluetoothLowEnergyException) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
