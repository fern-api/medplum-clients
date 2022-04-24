//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Device_UdiCarrier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDevice_UdiCarrier.builder()}.
 */
@org.immutables.value.Generated(from = "Device_UdiCarrier", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDevice_UdiCarrier implements com.fhir.Device_UdiCarrier {
  private final @javax.annotation.Nullable com.fhir.Device_udicarrierEntrytype entryType;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.uri issuer;
  private final @javax.annotation.Nullable com.fhir.uri jurisdiction;
  private final @javax.annotation.Nullable com.fhir.base64Binary carrierAIDC;
  private final @javax.annotation.Nullable java.lang.String deviceIdentifier;
  private final @javax.annotation.Nullable java.lang.String carrierHRF;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableDevice_UdiCarrier(
      @javax.annotation.Nullable com.fhir.Device_udicarrierEntrytype entryType,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.uri issuer,
      @javax.annotation.Nullable com.fhir.uri jurisdiction,
      @javax.annotation.Nullable com.fhir.base64Binary carrierAIDC,
      @javax.annotation.Nullable java.lang.String deviceIdentifier,
      @javax.annotation.Nullable java.lang.String carrierHRF,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.entryType = entryType;
    this.id = id;
    this.issuer = issuer;
    this.jurisdiction = jurisdiction;
    this.carrierAIDC = carrierAIDC;
    this.deviceIdentifier = deviceIdentifier;
    this.carrierHRF = carrierHRF;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code entryType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entryType")
  @Override
  public java.util.Optional<com.fhir.Device_udicarrierEntrytype> entryType() {
    return java.util.Optional.ofNullable(entryType);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code issuer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issuer")
  @Override
  public java.util.Optional<com.fhir.uri> issuer() {
    return java.util.Optional.ofNullable(issuer);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<com.fhir.uri> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code carrierAIDC} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("carrierAIDC")
  @Override
  public java.util.Optional<com.fhir.base64Binary> carrierAIDC() {
    return java.util.Optional.ofNullable(carrierAIDC);
  }

  /**
   * @return The value of the {@code deviceIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deviceIdentifier")
  @Override
  public java.util.Optional<java.lang.String> deviceIdentifier() {
    return java.util.Optional.ofNullable(deviceIdentifier);
  }

  /**
   * @return The value of the {@code carrierHRF} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("carrierHRF")
  @Override
  public java.util.Optional<java.lang.String> carrierHRF() {
    return java.util.Optional.ofNullable(carrierHRF);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#entryType() entryType} attribute.
   * @param value The value for entryType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withEntryType(com.fhir.Device_udicarrierEntrytype value) {
    @javax.annotation.Nullable com.fhir.Device_udicarrierEntrytype newValue = java.util.Objects.requireNonNull(value, "entryType");
    if (this.entryType == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        newValue,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#entryType() entryType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entryType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withEntryType(java.util.Optional<? extends com.fhir.Device_udicarrierEntrytype> optional) {
    @javax.annotation.Nullable com.fhir.Device_udicarrierEntrytype value = optional.orElse(null);
    if (this.entryType == value) return this;
    return new ImmutableDevice_UdiCarrier(
        value,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        newValue,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        value,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#issuer() issuer} attribute.
   * @param value The value for issuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withIssuer(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "issuer");
    if (this.issuer == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        newValue,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#issuer() issuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withIssuer(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.issuer == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        value,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withJurisdiction(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        newValue,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withJurisdiction(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        value,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} attribute.
   * @param value The value for carrierAIDC
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withCarrierAIDC(com.fhir.base64Binary value) {
    @javax.annotation.Nullable com.fhir.base64Binary newValue = java.util.Objects.requireNonNull(value, "carrierAIDC");
    if (this.carrierAIDC == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        newValue,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for carrierAIDC
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withCarrierAIDC(java.util.Optional<? extends com.fhir.base64Binary> optional) {
    @javax.annotation.Nullable com.fhir.base64Binary value = optional.orElse(null);
    if (this.carrierAIDC == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        value,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} attribute.
   * @param value The value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withDeviceIdentifier(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "deviceIdentifier");
    if (java.util.Objects.equals(this.deviceIdentifier, newValue)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        newValue,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withDeviceIdentifier(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.deviceIdentifier, value)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        value,
        this.carrierHRF,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#carrierHRF() carrierHRF} attribute.
   * @param value The value for carrierHRF
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withCarrierHRF(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "carrierHRF");
    if (java.util.Objects.equals(this.carrierHRF, newValue)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        newValue,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#carrierHRF() carrierHRF} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for carrierHRF
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withCarrierHRF(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.carrierHRF, value)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        value,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.id,
        this.issuer,
        this.jurisdiction,
        this.carrierAIDC,
        this.deviceIdentifier,
        this.carrierHRF,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDevice_UdiCarrier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDevice_UdiCarrier
        && equalTo((ImmutableDevice_UdiCarrier) another);
  }

  private boolean equalTo(ImmutableDevice_UdiCarrier another) {
    return java.util.Objects.equals(entryType, another.entryType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(issuer, another.issuer)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(carrierAIDC, another.carrierAIDC)
        && java.util.Objects.equals(deviceIdentifier, another.deviceIdentifier)
        && java.util.Objects.equals(carrierHRF, another.carrierHRF)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code entryType}, {@code id}, {@code issuer}, {@code jurisdiction}, {@code carrierAIDC}, {@code deviceIdentifier}, {@code carrierHRF}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(entryType);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(issuer);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(carrierAIDC);
    h += (h << 5) + java.util.Objects.hashCode(deviceIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(carrierHRF);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Device_UdiCarrier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Device_UdiCarrier{");
    if (entryType != null) {
      builder.append("entryType=").append(entryType);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (issuer != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("issuer=").append(issuer);
    }
    if (jurisdiction != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (carrierAIDC != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("carrierAIDC=").append(carrierAIDC);
    }
    if (deviceIdentifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("deviceIdentifier=").append(deviceIdentifier);
    }
    if (carrierHRF != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("carrierHRF=").append(carrierHRF);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Device_UdiCarrier", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Device_UdiCarrier {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Device_udicarrierEntrytype> entryType = java.util.Optional.empty();
    boolean entryTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> issuer = java.util.Optional.empty();
    boolean issuerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.base64Binary> carrierAIDC = java.util.Optional.empty();
    boolean carrierAIDCIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> deviceIdentifier = java.util.Optional.empty();
    boolean deviceIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> carrierHRF = java.util.Optional.empty();
    boolean carrierHRFIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("entryType")
    public void setEntryType(java.util.Optional<com.fhir.Device_udicarrierEntrytype> entryType) {
      this.entryType = entryType;
      this.entryTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    public void setIssuer(java.util.Optional<com.fhir.uri> issuer) {
      this.issuer = issuer;
      this.issuerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<com.fhir.uri> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("carrierAIDC")
    public void setCarrierAIDC(java.util.Optional<com.fhir.base64Binary> carrierAIDC) {
      this.carrierAIDC = carrierAIDC;
      this.carrierAIDCIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deviceIdentifier")
    public void setDeviceIdentifier(java.util.Optional<java.lang.String> deviceIdentifier) {
      this.deviceIdentifier = deviceIdentifier;
      this.deviceIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("carrierHRF")
    public void setCarrierHRF(java.util.Optional<java.lang.String> carrierHRF) {
      this.carrierHRF = carrierHRF;
      this.carrierHRFIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Device_udicarrierEntrytype> entryType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> issuer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.base64Binary> carrierAIDC() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> deviceIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> carrierHRF() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDevice_UdiCarrier fromJson(Json json) {
    ImmutableDevice_UdiCarrier.Builder builder = ImmutableDevice_UdiCarrier.builder();
    if (json.entryTypeIsSet) {
      builder.entryType(json.entryType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.issuerIsSet) {
      builder.issuer(json.issuer);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.carrierAIDCIsSet) {
      builder.carrierAIDC(json.carrierAIDC);
    }
    if (json.deviceIdentifierIsSet) {
      builder.deviceIdentifier(json.deviceIdentifier);
    }
    if (json.carrierHRFIsSet) {
      builder.carrierHRF(json.carrierHRF);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableDevice_UdiCarrier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Device_UdiCarrier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Device_UdiCarrier instance
   */
  public static Device_UdiCarrier copyOf(Device_UdiCarrier instance) {
    if (instance instanceof ImmutableDevice_UdiCarrier) {
      return (ImmutableDevice_UdiCarrier) instance;
    }
    return ImmutableDevice_UdiCarrier.builder()
        .entryType(instance.entryType())
        .id(instance.id())
        .issuer(instance.issuer())
        .jurisdiction(instance.jurisdiction())
        .carrierAIDC(instance.carrierAIDC())
        .deviceIdentifier(instance.deviceIdentifier())
        .carrierHRF(instance.carrierHRF())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Device_UdiCarrier Device_UdiCarrier}.
   * <pre>
   * ImmutableDevice_UdiCarrier.builder()
   *    .entryType(com.fhir.Device_udicarrierEntrytype) // optional {@link Device_UdiCarrier#entryType() entryType}
   *    .id(String) // optional {@link Device_UdiCarrier#id() id}
   *    .issuer(com.fhir.uri) // optional {@link Device_UdiCarrier#issuer() issuer}
   *    .jurisdiction(com.fhir.uri) // optional {@link Device_UdiCarrier#jurisdiction() jurisdiction}
   *    .carrierAIDC(com.fhir.base64Binary) // optional {@link Device_UdiCarrier#carrierAIDC() carrierAIDC}
   *    .deviceIdentifier(String) // optional {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier}
   *    .carrierHRF(String) // optional {@link Device_UdiCarrier#carrierHRF() carrierHRF}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Device_UdiCarrier#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Device_UdiCarrier#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Device_UdiCarrier builder
   */
  public static ImmutableDevice_UdiCarrier.Builder builder() {
    return new ImmutableDevice_UdiCarrier.Builder();
  }

  /**
   * Builds instances of type {@link Device_UdiCarrier Device_UdiCarrier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Device_UdiCarrier", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ENTRY_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_ISSUER = 0x4L;
    private static final long OPT_BIT_JURISDICTION = 0x8L;
    private static final long OPT_BIT_CARRIER_A_I_D_C = 0x10L;
    private static final long OPT_BIT_DEVICE_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_CARRIER_H_R_F = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Device_udicarrierEntrytype entryType;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.uri issuer;
    private @javax.annotation.Nullable com.fhir.uri jurisdiction;
    private @javax.annotation.Nullable com.fhir.base64Binary carrierAIDC;
    private @javax.annotation.Nullable java.lang.String deviceIdentifier;
    private @javax.annotation.Nullable java.lang.String carrierHRF;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#entryType() entryType} to entryType.
     * @param entryType The value for entryType
     * @return {@code this} builder for chained invocation
     */
    public final Builder entryType(com.fhir.Device_udicarrierEntrytype entryType) {
      checkNotIsSet(entryTypeIsSet(), "entryType");
      this.entryType = java.util.Objects.requireNonNull(entryType, "entryType");
      optBits |= OPT_BIT_ENTRY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#entryType() entryType} to entryType.
     * @param entryType The value for entryType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entryType")
    public final Builder entryType(java.util.Optional<? extends com.fhir.Device_udicarrierEntrytype> entryType) {
      checkNotIsSet(entryTypeIsSet(), "entryType");
      this.entryType = entryType.orElse(null);
      optBits |= OPT_BIT_ENTRY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuer(com.fhir.uri issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = java.util.Objects.requireNonNull(issuer, "issuer");
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    public final Builder issuer(java.util.Optional<? extends com.fhir.uri> issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = issuer.orElse(null);
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(com.fhir.uri jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = java.util.Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public final Builder jurisdiction(java.util.Optional<? extends com.fhir.uri> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} to carrierAIDC.
     * @param carrierAIDC The value for carrierAIDC
     * @return {@code this} builder for chained invocation
     */
    public final Builder carrierAIDC(com.fhir.base64Binary carrierAIDC) {
      checkNotIsSet(carrierAIDCIsSet(), "carrierAIDC");
      this.carrierAIDC = java.util.Objects.requireNonNull(carrierAIDC, "carrierAIDC");
      optBits |= OPT_BIT_CARRIER_A_I_D_C;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} to carrierAIDC.
     * @param carrierAIDC The value for carrierAIDC
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("carrierAIDC")
    public final Builder carrierAIDC(java.util.Optional<? extends com.fhir.base64Binary> carrierAIDC) {
      checkNotIsSet(carrierAIDCIsSet(), "carrierAIDC");
      this.carrierAIDC = carrierAIDC.orElse(null);
      optBits |= OPT_BIT_CARRIER_A_I_D_C;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceIdentifier(java.lang.String deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = java.util.Objects.requireNonNull(deviceIdentifier, "deviceIdentifier");
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceIdentifier")
    public final Builder deviceIdentifier(java.util.Optional<java.lang.String> deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = deviceIdentifier.orElse(null);
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierHRF() carrierHRF} to carrierHRF.
     * @param carrierHRF The value for carrierHRF
     * @return {@code this} builder for chained invocation
     */
    public final Builder carrierHRF(java.lang.String carrierHRF) {
      checkNotIsSet(carrierHRFIsSet(), "carrierHRF");
      this.carrierHRF = java.util.Objects.requireNonNull(carrierHRF, "carrierHRF");
      optBits |= OPT_BIT_CARRIER_H_R_F;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierHRF() carrierHRF} to carrierHRF.
     * @param carrierHRF The value for carrierHRF
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("carrierHRF")
    public final Builder carrierHRF(java.util.Optional<java.lang.String> carrierHRF) {
      checkNotIsSet(carrierHRFIsSet(), "carrierHRF");
      this.carrierHRF = carrierHRF.orElse(null);
      optBits |= OPT_BIT_CARRIER_H_R_F;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link Device_UdiCarrier Device_UdiCarrier}.
     * @return An immutable instance of Device_UdiCarrier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Device_UdiCarrier build() {
      return new ImmutableDevice_UdiCarrier(
          entryType,
          id,
          issuer,
          jurisdiction,
          carrierAIDC,
          deviceIdentifier,
          carrierHRF,
          extension,
          modifierExtension);
    }

    private boolean entryTypeIsSet() {
      return (optBits & OPT_BIT_ENTRY_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean issuerIsSet() {
      return (optBits & OPT_BIT_ISSUER) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean carrierAIDCIsSet() {
      return (optBits & OPT_BIT_CARRIER_A_I_D_C) != 0;
    }

    private boolean deviceIdentifierIsSet() {
      return (optBits & OPT_BIT_DEVICE_IDENTIFIER) != 0;
    }

    private boolean carrierHRFIsSet() {
      return (optBits & OPT_BIT_CARRIER_H_R_F) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Device_UdiCarrier is strict, attribute is already set: ".concat(name));
    }
  }
}
