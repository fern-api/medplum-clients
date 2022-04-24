package com.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CoverageEligibilityResponse_Benefit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityResponse_Benefit.builder()}.
 */
@Generated(from = "CoverageEligibilityResponse_Benefit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityResponse_Benefit
    implements CoverageEligibilityResponse_Benefit {
  private final @Nullable String id;
  private final CodeableConcept type;
  private final @Nullable String allowedString;
  private final @Nullable String usedString;
  private final @Nullable Double usedUnsignedInt;
  private final @Nullable Money usedMoney;
  private final @Nullable Money allowedMoney;
  private final @Nullable List<Extension> extension;
  private final @Nullable Double allowedUnsignedInt;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableCoverageEligibilityResponse_Benefit(
      @Nullable String id,
      CodeableConcept type,
      @Nullable String allowedString,
      @Nullable String usedString,
      @Nullable Double usedUnsignedInt,
      @Nullable Money usedMoney,
      @Nullable Money allowedMoney,
      @Nullable List<Extension> extension,
      @Nullable Double allowedUnsignedInt,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.type = type;
    this.allowedString = allowedString;
    this.usedString = usedString;
    this.usedUnsignedInt = usedUnsignedInt;
    this.usedMoney = usedMoney;
    this.allowedMoney = allowedMoney;
    this.extension = extension;
    this.allowedUnsignedInt = allowedUnsignedInt;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code allowedString} attribute
   */
  @JsonProperty("allowedString")
  @Override
  public Optional<String> allowedString() {
    return Optional.ofNullable(allowedString);
  }

  /**
   * @return The value of the {@code usedString} attribute
   */
  @JsonProperty("usedString")
  @Override
  public Optional<String> usedString() {
    return Optional.ofNullable(usedString);
  }

  /**
   * @return The value of the {@code usedUnsignedInt} attribute
   */
  @JsonProperty("usedUnsignedInt")
  @Override
  public Optional<Double> usedUnsignedInt() {
    return Optional.ofNullable(usedUnsignedInt);
  }

  /**
   * @return The value of the {@code usedMoney} attribute
   */
  @JsonProperty("usedMoney")
  @Override
  public Optional<Money> usedMoney() {
    return Optional.ofNullable(usedMoney);
  }

  /**
   * @return The value of the {@code allowedMoney} attribute
   */
  @JsonProperty("allowedMoney")
  @Override
  public Optional<Money> allowedMoney() {
    return Optional.ofNullable(allowedMoney);
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
   * @return The value of the {@code allowedUnsignedInt} attribute
   */
  @JsonProperty("allowedUnsignedInt")
  @Override
  public Optional<Double> allowedUnsignedInt() {
    return Optional.ofNullable(allowedUnsignedInt);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        newValue,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        value,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse_Benefit#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        newValue,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString} attribute.
   * @param value The value for allowedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withAllowedString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "allowedString");
    if (Objects.equals(this.allowedString, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        newValue,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withAllowedString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.allowedString, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        value,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#usedString() usedString} attribute.
   * @param value The value for usedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withUsedString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "usedString");
    if (Objects.equals(this.usedString, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        newValue,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#usedString() usedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withUsedString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.usedString, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        value,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt} attribute.
   * @param value The value for usedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withUsedUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.usedUnsignedInt, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        newValue,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withUsedUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.usedUnsignedInt, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        value,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney} attribute.
   * @param value The value for usedMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withUsedMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "usedMoney");
    if (this.usedMoney == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        newValue,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Benefit withUsedMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.usedMoney == value) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        value,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney} attribute.
   * @param value The value for allowedMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withAllowedMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "allowedMoney");
    if (this.allowedMoney == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        newValue,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Benefit withAllowedMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.allowedMoney == value) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        value,
        this.extension,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        newValue,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Benefit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        value,
        this.allowedUnsignedInt,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt} attribute.
   * @param value The value for allowedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withAllowedUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.allowedUnsignedInt, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withAllowedUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.allowedUnsignedInt, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Benefit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Benefit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Benefit(
        this.id,
        this.type,
        this.allowedString,
        this.usedString,
        this.usedUnsignedInt,
        this.usedMoney,
        this.allowedMoney,
        this.extension,
        this.allowedUnsignedInt,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityResponse_Benefit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityResponse_Benefit
        && equalTo((ImmutableCoverageEligibilityResponse_Benefit) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityResponse_Benefit another) {
    return Objects.equals(id, another.id)
        && type.equals(another.type)
        && Objects.equals(allowedString, another.allowedString)
        && Objects.equals(usedString, another.usedString)
        && Objects.equals(usedUnsignedInt, another.usedUnsignedInt)
        && Objects.equals(usedMoney, another.usedMoney)
        && Objects.equals(allowedMoney, another.allowedMoney)
        && Objects.equals(extension, another.extension)
        && Objects.equals(allowedUnsignedInt, another.allowedUnsignedInt)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code type}, {@code allowedString}, {@code usedString}, {@code usedUnsignedInt}, {@code usedMoney}, {@code allowedMoney}, {@code extension}, {@code allowedUnsignedInt}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(allowedString);
    h += (h << 5) + Objects.hashCode(usedString);
    h += (h << 5) + Objects.hashCode(usedUnsignedInt);
    h += (h << 5) + Objects.hashCode(usedMoney);
    h += (h << 5) + Objects.hashCode(allowedMoney);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(allowedUnsignedInt);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityResponse_Benefit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityResponse_Benefit{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (builder.length() > 36) builder.append(", ");
    builder.append("type=").append(type);
    if (allowedString != null) {
      builder.append(", ");
      builder.append("allowedString=").append(allowedString);
    }
    if (usedString != null) {
      builder.append(", ");
      builder.append("usedString=").append(usedString);
    }
    if (usedUnsignedInt != null) {
      builder.append(", ");
      builder.append("usedUnsignedInt=").append(usedUnsignedInt);
    }
    if (usedMoney != null) {
      builder.append(", ");
      builder.append("usedMoney=").append(usedMoney);
    }
    if (allowedMoney != null) {
      builder.append(", ");
      builder.append("allowedMoney=").append(allowedMoney);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (allowedUnsignedInt != null) {
      builder.append(", ");
      builder.append("allowedUnsignedInt=").append(allowedUnsignedInt);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityResponse_Benefit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityResponse_Benefit {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<String> allowedString = Optional.empty();
    boolean allowedStringIsSet;
    @Nullable Optional<String> usedString = Optional.empty();
    boolean usedStringIsSet;
    @Nullable Optional<Double> usedUnsignedInt = Optional.empty();
    boolean usedUnsignedIntIsSet;
    @Nullable Optional<Money> usedMoney = Optional.empty();
    boolean usedMoneyIsSet;
    @Nullable Optional<Money> allowedMoney = Optional.empty();
    boolean allowedMoneyIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Double> allowedUnsignedInt = Optional.empty();
    boolean allowedUnsignedIntIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("allowedString")
    public void setAllowedString(Optional<String> allowedString) {
      this.allowedString = allowedString;
      this.allowedStringIsSet = true;
    }
    @JsonProperty("usedString")
    public void setUsedString(Optional<String> usedString) {
      this.usedString = usedString;
      this.usedStringIsSet = true;
    }
    @JsonProperty("usedUnsignedInt")
    public void setUsedUnsignedInt(Optional<Double> usedUnsignedInt) {
      this.usedUnsignedInt = usedUnsignedInt;
      this.usedUnsignedIntIsSet = true;
    }
    @JsonProperty("usedMoney")
    public void setUsedMoney(Optional<Money> usedMoney) {
      this.usedMoney = usedMoney;
      this.usedMoneyIsSet = true;
    }
    @JsonProperty("allowedMoney")
    public void setAllowedMoney(Optional<Money> allowedMoney) {
      this.allowedMoney = allowedMoney;
      this.allowedMoneyIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("allowedUnsignedInt")
    public void setAllowedUnsignedInt(Optional<Double> allowedUnsignedInt) {
      this.allowedUnsignedInt = allowedUnsignedInt;
      this.allowedUnsignedIntIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> allowedString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> usedString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> usedUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> usedMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> allowedMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> allowedUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityResponse_Benefit fromJson(Json json) {
    ImmutableCoverageEligibilityResponse_Benefit.Builder builder = ((ImmutableCoverageEligibilityResponse_Benefit.Builder) ImmutableCoverageEligibilityResponse_Benefit.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.allowedStringIsSet) {
      builder.allowedString(json.allowedString);
    }
    if (json.usedStringIsSet) {
      builder.usedString(json.usedString);
    }
    if (json.usedUnsignedIntIsSet) {
      builder.usedUnsignedInt(json.usedUnsignedInt);
    }
    if (json.usedMoneyIsSet) {
      builder.usedMoney(json.usedMoney);
    }
    if (json.allowedMoneyIsSet) {
      builder.allowedMoney(json.allowedMoney);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.allowedUnsignedIntIsSet) {
      builder.allowedUnsignedInt(json.allowedUnsignedInt);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableCoverageEligibilityResponse_Benefit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityResponse_Benefit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityResponse_Benefit instance
   */
  public static CoverageEligibilityResponse_Benefit copyOf(CoverageEligibilityResponse_Benefit instance) {
    if (instance instanceof ImmutableCoverageEligibilityResponse_Benefit) {
      return (ImmutableCoverageEligibilityResponse_Benefit) instance;
    }
    return ((ImmutableCoverageEligibilityResponse_Benefit.Builder) ImmutableCoverageEligibilityResponse_Benefit.builder())
        .id(instance.id())
        .type(instance.type())
        .allowedString(instance.allowedString())
        .usedString(instance.usedString())
        .usedUnsignedInt(instance.usedUnsignedInt())
        .usedMoney(instance.usedMoney())
        .allowedMoney(instance.allowedMoney())
        .extension(instance.extension())
        .allowedUnsignedInt(instance.allowedUnsignedInt())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityResponse_Benefit CoverageEligibilityResponse_Benefit}.
   * <pre>
   * ImmutableCoverageEligibilityResponse_Benefit.builder()
   *    .id(String) // optional {@link CoverageEligibilityResponse_Benefit#id() id}
   *    .type(com.fhir.CodeableConcept) // required {@link CoverageEligibilityResponse_Benefit#type() type}
   *    .allowedString(String) // optional {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString}
   *    .usedString(String) // optional {@link CoverageEligibilityResponse_Benefit#usedString() usedString}
   *    .usedUnsignedInt(Double) // optional {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt}
   *    .usedMoney(com.fhir.Money) // optional {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney}
   *    .allowedMoney(com.fhir.Money) // optional {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Benefit#extension() extension}
   *    .allowedUnsignedInt(Double) // optional {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityResponse_Benefit builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableCoverageEligibilityResponse_Benefit.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityResponse_Benefit CoverageEligibilityResponse_Benefit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoverageEligibilityResponse_Benefit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ALLOWED_STRING = 0x2L;
    private static final long OPT_BIT_USED_STRING = 0x4L;
    private static final long OPT_BIT_USED_UNSIGNED_INT = 0x8L;
    private static final long OPT_BIT_USED_MONEY = 0x10L;
    private static final long OPT_BIT_ALLOWED_MONEY = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_ALLOWED_UNSIGNED_INT = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable String allowedString;
    private @Nullable String usedString;
    private @Nullable Double usedUnsignedInt;
    private @Nullable Money usedMoney;
    private @Nullable Money allowedMoney;
    private @Nullable List<Extension> extension;
    private @Nullable Double allowedUnsignedInt;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#id() id} to id.
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
     * Initializes the value for the {@link CoverageEligibilityResponse_Benefit#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString} to allowedString.
     * @param allowedString The value for allowedString
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedString(String allowedString) {
      checkNotIsSet(allowedStringIsSet(), "allowedString");
      this.allowedString = Objects.requireNonNull(allowedString, "allowedString");
      optBits |= OPT_BIT_ALLOWED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString} to allowedString.
     * @param allowedString The value for allowedString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowedString")
    public final Builder allowedString(Optional<String> allowedString) {
      checkNotIsSet(allowedStringIsSet(), "allowedString");
      this.allowedString = allowedString.orElse(null);
      optBits |= OPT_BIT_ALLOWED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedString() usedString} to usedString.
     * @param usedString The value for usedString
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedString(String usedString) {
      checkNotIsSet(usedStringIsSet(), "usedString");
      this.usedString = Objects.requireNonNull(usedString, "usedString");
      optBits |= OPT_BIT_USED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedString() usedString} to usedString.
     * @param usedString The value for usedString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usedString")
    public final Builder usedString(Optional<String> usedString) {
      checkNotIsSet(usedStringIsSet(), "usedString");
      this.usedString = usedString.orElse(null);
      optBits |= OPT_BIT_USED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
     * @param usedUnsignedInt The value for usedUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedUnsignedInt(double usedUnsignedInt) {
      checkNotIsSet(usedUnsignedIntIsSet(), "usedUnsignedInt");
      this.usedUnsignedInt = usedUnsignedInt;
      optBits |= OPT_BIT_USED_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
     * @param usedUnsignedInt The value for usedUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usedUnsignedInt")
    public final Builder usedUnsignedInt(Optional<Double> usedUnsignedInt) {
      checkNotIsSet(usedUnsignedIntIsSet(), "usedUnsignedInt");
      this.usedUnsignedInt = usedUnsignedInt.orElse(null);
      optBits |= OPT_BIT_USED_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney} to usedMoney.
     * @param usedMoney The value for usedMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedMoney(Money usedMoney) {
      checkNotIsSet(usedMoneyIsSet(), "usedMoney");
      this.usedMoney = Objects.requireNonNull(usedMoney, "usedMoney");
      optBits |= OPT_BIT_USED_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney} to usedMoney.
     * @param usedMoney The value for usedMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usedMoney")
    public final Builder usedMoney(Optional<? extends Money> usedMoney) {
      checkNotIsSet(usedMoneyIsSet(), "usedMoney");
      this.usedMoney = usedMoney.orElse(null);
      optBits |= OPT_BIT_USED_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney} to allowedMoney.
     * @param allowedMoney The value for allowedMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedMoney(Money allowedMoney) {
      checkNotIsSet(allowedMoneyIsSet(), "allowedMoney");
      this.allowedMoney = Objects.requireNonNull(allowedMoney, "allowedMoney");
      optBits |= OPT_BIT_ALLOWED_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney} to allowedMoney.
     * @param allowedMoney The value for allowedMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowedMoney")
    public final Builder allowedMoney(Optional<? extends Money> allowedMoney) {
      checkNotIsSet(allowedMoneyIsSet(), "allowedMoney");
      this.allowedMoney = allowedMoney.orElse(null);
      optBits |= OPT_BIT_ALLOWED_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
     * @param allowedUnsignedInt The value for allowedUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedUnsignedInt(double allowedUnsignedInt) {
      checkNotIsSet(allowedUnsignedIntIsSet(), "allowedUnsignedInt");
      this.allowedUnsignedInt = allowedUnsignedInt;
      optBits |= OPT_BIT_ALLOWED_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
     * @param allowedUnsignedInt The value for allowedUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowedUnsignedInt")
    public final Builder allowedUnsignedInt(Optional<Double> allowedUnsignedInt) {
      checkNotIsSet(allowedUnsignedIntIsSet(), "allowedUnsignedInt");
      this.allowedUnsignedInt = allowedUnsignedInt.orElse(null);
      optBits |= OPT_BIT_ALLOWED_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link CoverageEligibilityResponse_Benefit CoverageEligibilityResponse_Benefit}.
     * @return An immutable instance of CoverageEligibilityResponse_Benefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityResponse_Benefit build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityResponse_Benefit(
          id,
          type,
          allowedString,
          usedString,
          usedUnsignedInt,
          usedMoney,
          allowedMoney,
          extension,
          allowedUnsignedInt,
          modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean allowedStringIsSet() {
      return (optBits & OPT_BIT_ALLOWED_STRING) != 0;
    }

    private boolean usedStringIsSet() {
      return (optBits & OPT_BIT_USED_STRING) != 0;
    }

    private boolean usedUnsignedIntIsSet() {
      return (optBits & OPT_BIT_USED_UNSIGNED_INT) != 0;
    }

    private boolean usedMoneyIsSet() {
      return (optBits & OPT_BIT_USED_MONEY) != 0;
    }

    private boolean allowedMoneyIsSet() {
      return (optBits & OPT_BIT_ALLOWED_MONEY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean allowedUnsignedIntIsSet() {
      return (optBits & OPT_BIT_ALLOWED_UNSIGNED_INT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityResponse_Benefit is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build CoverageEligibilityResponse_Benefit, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CoverageEligibilityResponse_Benefit", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse_Benefit#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "CoverageEligibilityResponse_Benefit", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString} to allowedString.
     * @param allowedString The value for allowedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedString(String allowedString);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedString() allowedString} to allowedString.
     * @param allowedString The value for allowedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedString(Optional<String> allowedString);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedString() usedString} to usedString.
     * @param usedString The value for usedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedString(String usedString);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedString() usedString} to usedString.
     * @param usedString The value for usedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedString(Optional<String> usedString);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
     * @param usedUnsignedInt The value for usedUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedUnsignedInt(double usedUnsignedInt);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
     * @param usedUnsignedInt The value for usedUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedUnsignedInt(Optional<Double> usedUnsignedInt);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney} to usedMoney.
     * @param usedMoney The value for usedMoney
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedMoney(Money usedMoney);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#usedMoney() usedMoney} to usedMoney.
     * @param usedMoney The value for usedMoney
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedMoney(Optional<? extends Money> usedMoney);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney} to allowedMoney.
     * @param allowedMoney The value for allowedMoney
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedMoney(Money allowedMoney);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedMoney() allowedMoney} to allowedMoney.
     * @param allowedMoney The value for allowedMoney
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedMoney(Optional<? extends Money> allowedMoney);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
     * @param allowedUnsignedInt The value for allowedUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedUnsignedInt(double allowedUnsignedInt);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
     * @param allowedUnsignedInt The value for allowedUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedUnsignedInt(Optional<Double> allowedUnsignedInt);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Benefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link CoverageEligibilityResponse_Benefit CoverageEligibilityResponse_Benefit}.
     * @return An immutable instance of CoverageEligibilityResponse_Benefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityResponse_Benefit build();
  }
}
