package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Device_UdiCarrier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDevice_UdiCarrier.builder()}.
 */
@Generated(from = "Device_UdiCarrier", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDevice_UdiCarrier implements Device_UdiCarrier {
  private final @Nullable Device_udicarrierEntrytype entryType;
  private final @Nullable String deviceIdentifier;
  private final @Nullable Uri issuer;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri jurisdiction;
  private final @Nullable Base64Binary carrierAIDC;
  private final @Nullable String id;
  private final @Nullable String carrierHRF;

  private ImmutableDevice_UdiCarrier(
      @Nullable Device_udicarrierEntrytype entryType,
      @Nullable String deviceIdentifier,
      @Nullable Uri issuer,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri jurisdiction,
      @Nullable Base64Binary carrierAIDC,
      @Nullable String id,
      @Nullable String carrierHRF) {
    this.entryType = entryType;
    this.deviceIdentifier = deviceIdentifier;
    this.issuer = issuer;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.jurisdiction = jurisdiction;
    this.carrierAIDC = carrierAIDC;
    this.id = id;
    this.carrierHRF = carrierHRF;
  }

  /**
   * @return The value of the {@code entryType} attribute
   */
  @JsonProperty("entryType")
  @Override
  public Optional<Device_udicarrierEntrytype> entryType() {
    return Optional.ofNullable(entryType);
  }

  /**
   * @return The value of the {@code deviceIdentifier} attribute
   */
  @JsonProperty("deviceIdentifier")
  @Override
  public Optional<String> deviceIdentifier() {
    return Optional.ofNullable(deviceIdentifier);
  }

  /**
   * @return The value of the {@code issuer} attribute
   */
  @JsonProperty("issuer")
  @Override
  public Optional<Uri> issuer() {
    return Optional.ofNullable(issuer);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<Uri> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code carrierAIDC} attribute
   */
  @JsonProperty("carrierAIDC")
  @Override
  public Optional<Base64Binary> carrierAIDC() {
    return Optional.ofNullable(carrierAIDC);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code carrierHRF} attribute
   */
  @JsonProperty("carrierHRF")
  @Override
  public Optional<String> carrierHRF() {
    return Optional.ofNullable(carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#entryType() entryType} attribute.
   * @param value The value for entryType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withEntryType(Device_udicarrierEntrytype value) {
    @Nullable Device_udicarrierEntrytype newValue = Objects.requireNonNull(value, "entryType");
    if (this.entryType == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        newValue,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#entryType() entryType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entryType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withEntryType(Optional<? extends Device_udicarrierEntrytype> optional) {
    @Nullable Device_udicarrierEntrytype value = optional.orElse(null);
    if (this.entryType == value) return this;
    return new ImmutableDevice_UdiCarrier(
        value,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} attribute.
   * @param value The value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withDeviceIdentifier(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "deviceIdentifier");
    if (Objects.equals(this.deviceIdentifier, newValue)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        newValue,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withDeviceIdentifier(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.deviceIdentifier, value)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        value,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#issuer() issuer} attribute.
   * @param value The value for issuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withIssuer(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "issuer");
    if (this.issuer == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        newValue,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#issuer() issuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withIssuer(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.issuer == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        value,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        newValue,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        value,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        newValue,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        value,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withJurisdiction(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        newValue,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withJurisdiction(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        value,
        this.carrierAIDC,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} attribute.
   * @param value The value for carrierAIDC
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withCarrierAIDC(Base64Binary value) {
    @Nullable Base64Binary newValue = Objects.requireNonNull(value, "carrierAIDC");
    if (this.carrierAIDC == newValue) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        newValue,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for carrierAIDC
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_UdiCarrier withCarrierAIDC(Optional<? extends Base64Binary> optional) {
    @Nullable Base64Binary value = optional.orElse(null);
    if (this.carrierAIDC == value) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        value,
        this.id,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        newValue,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        value,
        this.carrierHRF);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_UdiCarrier#carrierHRF() carrierHRF} attribute.
   * @param value The value for carrierHRF
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withCarrierHRF(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "carrierHRF");
    if (Objects.equals(this.carrierHRF, newValue)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_UdiCarrier#carrierHRF() carrierHRF} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for carrierHRF
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_UdiCarrier withCarrierHRF(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.carrierHRF, value)) return this;
    return new ImmutableDevice_UdiCarrier(
        this.entryType,
        this.deviceIdentifier,
        this.issuer,
        this.extension,
        this.modifierExtension,
        this.jurisdiction,
        this.carrierAIDC,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDevice_UdiCarrier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDevice_UdiCarrier
        && equalTo((ImmutableDevice_UdiCarrier) another);
  }

  private boolean equalTo(ImmutableDevice_UdiCarrier another) {
    return Objects.equals(entryType, another.entryType)
        && Objects.equals(deviceIdentifier, another.deviceIdentifier)
        && Objects.equals(issuer, another.issuer)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(carrierAIDC, another.carrierAIDC)
        && Objects.equals(id, another.id)
        && Objects.equals(carrierHRF, another.carrierHRF);
  }

  /**
   * Computes a hash code from attributes: {@code entryType}, {@code deviceIdentifier}, {@code issuer}, {@code extension}, {@code modifierExtension}, {@code jurisdiction}, {@code carrierAIDC}, {@code id}, {@code carrierHRF}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(entryType);
    h += (h << 5) + Objects.hashCode(deviceIdentifier);
    h += (h << 5) + Objects.hashCode(issuer);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(carrierAIDC);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(carrierHRF);
    return h;
  }

  /**
   * Prints the immutable value {@code Device_UdiCarrier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Device_UdiCarrier{");
    if (entryType != null) {
      builder.append("entryType=").append(entryType);
    }
    if (deviceIdentifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("deviceIdentifier=").append(deviceIdentifier);
    }
    if (issuer != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("issuer=").append(issuer);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (jurisdiction != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (carrierAIDC != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("carrierAIDC=").append(carrierAIDC);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (carrierHRF != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("carrierHRF=").append(carrierHRF);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Device_UdiCarrier", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Device_UdiCarrier {
    @Nullable Optional<Device_udicarrierEntrytype> entryType = Optional.empty();
    boolean entryTypeIsSet;
    @Nullable Optional<String> deviceIdentifier = Optional.empty();
    boolean deviceIdentifierIsSet;
    @Nullable Optional<Uri> issuer = Optional.empty();
    boolean issuerIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Base64Binary> carrierAIDC = Optional.empty();
    boolean carrierAIDCIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> carrierHRF = Optional.empty();
    boolean carrierHRFIsSet;
    @JsonProperty("entryType")
    public void setEntryType(Optional<Device_udicarrierEntrytype> entryType) {
      this.entryType = entryType;
      this.entryTypeIsSet = true;
    }
    @JsonProperty("deviceIdentifier")
    public void setDeviceIdentifier(Optional<String> deviceIdentifier) {
      this.deviceIdentifier = deviceIdentifier;
      this.deviceIdentifierIsSet = true;
    }
    @JsonProperty("issuer")
    public void setIssuer(Optional<Uri> issuer) {
      this.issuer = issuer;
      this.issuerIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<Uri> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("carrierAIDC")
    public void setCarrierAIDC(Optional<Base64Binary> carrierAIDC) {
      this.carrierAIDC = carrierAIDC;
      this.carrierAIDCIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("carrierHRF")
    public void setCarrierHRF(Optional<String> carrierHRF) {
      this.carrierHRF = carrierHRF;
      this.carrierHRFIsSet = true;
    }
    @Override
    public Optional<Device_udicarrierEntrytype> entryType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> deviceIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> issuer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Base64Binary> carrierAIDC() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> carrierHRF() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDevice_UdiCarrier fromJson(Json json) {
    ImmutableDevice_UdiCarrier.Builder builder = ImmutableDevice_UdiCarrier.builder();
    if (json.entryTypeIsSet) {
      builder.entryType(json.entryType);
    }
    if (json.deviceIdentifierIsSet) {
      builder.deviceIdentifier(json.deviceIdentifier);
    }
    if (json.issuerIsSet) {
      builder.issuer(json.issuer);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.carrierAIDCIsSet) {
      builder.carrierAIDC(json.carrierAIDC);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.carrierHRFIsSet) {
      builder.carrierHRF(json.carrierHRF);
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
        .deviceIdentifier(instance.deviceIdentifier())
        .issuer(instance.issuer())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .jurisdiction(instance.jurisdiction())
        .carrierAIDC(instance.carrierAIDC())
        .id(instance.id())
        .carrierHRF(instance.carrierHRF())
        .build();
  }

  /**
   * Creates a builder for {@link Device_UdiCarrier Device_UdiCarrier}.
   * <pre>
   * ImmutableDevice_UdiCarrier.builder()
   *    .entryType(com.medplum.types.fhir.Device_udicarrierEntrytype) // optional {@link Device_UdiCarrier#entryType() entryType}
   *    .deviceIdentifier(String) // optional {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier}
   *    .issuer(com.medplum.types.fhir.Uri) // optional {@link Device_UdiCarrier#issuer() issuer}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Device_UdiCarrier#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Device_UdiCarrier#modifierExtension() modifierExtension}
   *    .jurisdiction(com.medplum.types.fhir.Uri) // optional {@link Device_UdiCarrier#jurisdiction() jurisdiction}
   *    .carrierAIDC(com.medplum.types.fhir.Base64Binary) // optional {@link Device_UdiCarrier#carrierAIDC() carrierAIDC}
   *    .id(String) // optional {@link Device_UdiCarrier#id() id}
   *    .carrierHRF(String) // optional {@link Device_UdiCarrier#carrierHRF() carrierHRF}
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
  @Generated(from = "Device_UdiCarrier", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ENTRY_TYPE = 0x1L;
    private static final long OPT_BIT_DEVICE_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_ISSUER = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_JURISDICTION = 0x20L;
    private static final long OPT_BIT_CARRIER_A_I_D_C = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_CARRIER_H_R_F = 0x100L;
    private long optBits;

    private @Nullable Device_udicarrierEntrytype entryType;
    private @Nullable String deviceIdentifier;
    private @Nullable Uri issuer;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri jurisdiction;
    private @Nullable Base64Binary carrierAIDC;
    private @Nullable String id;
    private @Nullable String carrierHRF;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#entryType() entryType} to entryType.
     * @param entryType The value for entryType
     * @return {@code this} builder for chained invocation
     */
    public final Builder entryType(Device_udicarrierEntrytype entryType) {
      checkNotIsSet(entryTypeIsSet(), "entryType");
      this.entryType = Objects.requireNonNull(entryType, "entryType");
      optBits |= OPT_BIT_ENTRY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#entryType() entryType} to entryType.
     * @param entryType The value for entryType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entryType")
    public final Builder entryType(Optional<? extends Device_udicarrierEntrytype> entryType) {
      checkNotIsSet(entryTypeIsSet(), "entryType");
      this.entryType = entryType.orElse(null);
      optBits |= OPT_BIT_ENTRY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceIdentifier(String deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = Objects.requireNonNull(deviceIdentifier, "deviceIdentifier");
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deviceIdentifier")
    public final Builder deviceIdentifier(Optional<String> deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = deviceIdentifier.orElse(null);
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuer(Uri issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = Objects.requireNonNull(issuer, "issuer");
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuer")
    public final Builder issuer(Optional<? extends Uri> issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = issuer.orElse(null);
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
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
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(Uri jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends Uri> jurisdiction) {
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
    public final Builder carrierAIDC(Base64Binary carrierAIDC) {
      checkNotIsSet(carrierAIDCIsSet(), "carrierAIDC");
      this.carrierAIDC = Objects.requireNonNull(carrierAIDC, "carrierAIDC");
      optBits |= OPT_BIT_CARRIER_A_I_D_C;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierAIDC() carrierAIDC} to carrierAIDC.
     * @param carrierAIDC The value for carrierAIDC
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("carrierAIDC")
    public final Builder carrierAIDC(Optional<? extends Base64Binary> carrierAIDC) {
      checkNotIsSet(carrierAIDCIsSet(), "carrierAIDC");
      this.carrierAIDC = carrierAIDC.orElse(null);
      optBits |= OPT_BIT_CARRIER_A_I_D_C;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierHRF() carrierHRF} to carrierHRF.
     * @param carrierHRF The value for carrierHRF
     * @return {@code this} builder for chained invocation
     */
    public final Builder carrierHRF(String carrierHRF) {
      checkNotIsSet(carrierHRFIsSet(), "carrierHRF");
      this.carrierHRF = Objects.requireNonNull(carrierHRF, "carrierHRF");
      optBits |= OPT_BIT_CARRIER_H_R_F;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_UdiCarrier#carrierHRF() carrierHRF} to carrierHRF.
     * @param carrierHRF The value for carrierHRF
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("carrierHRF")
    public final Builder carrierHRF(Optional<String> carrierHRF) {
      checkNotIsSet(carrierHRFIsSet(), "carrierHRF");
      this.carrierHRF = carrierHRF.orElse(null);
      optBits |= OPT_BIT_CARRIER_H_R_F;
      return this;
    }

    /**
     * Builds a new {@link Device_UdiCarrier Device_UdiCarrier}.
     * @return An immutable instance of Device_UdiCarrier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Device_UdiCarrier build() {
      return new ImmutableDevice_UdiCarrier(
          entryType,
          deviceIdentifier,
          issuer,
          extension,
          modifierExtension,
          jurisdiction,
          carrierAIDC,
          id,
          carrierHRF);
    }

    private boolean entryTypeIsSet() {
      return (optBits & OPT_BIT_ENTRY_TYPE) != 0;
    }

    private boolean deviceIdentifierIsSet() {
      return (optBits & OPT_BIT_DEVICE_IDENTIFIER) != 0;
    }

    private boolean issuerIsSet() {
      return (optBits & OPT_BIT_ISSUER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean carrierAIDCIsSet() {
      return (optBits & OPT_BIT_CARRIER_A_I_D_C) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean carrierHRFIsSet() {
      return (optBits & OPT_BIT_CARRIER_H_R_F) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Device_UdiCarrier is strict, attribute is already set: ".concat(name));
    }
  }
}
