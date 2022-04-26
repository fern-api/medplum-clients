package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ExplanationOfBenefit_Financial}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Financial.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Financial", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Financial
    implements ExplanationOfBenefit_Financial {
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept type;
  private final @Nullable Double allowedUnsignedInt;
  private final @Nullable String allowedString;
  private final @Nullable Money allowedMoney;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Money usedMoney;
  private final @Nullable Double usedUnsignedInt;

  private ImmutableExplanationOfBenefit_Financial(
      @Nullable List<Extension> modifierExtension,
      CodeableConcept type,
      @Nullable Double allowedUnsignedInt,
      @Nullable String allowedString,
      @Nullable Money allowedMoney,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Money usedMoney,
      @Nullable Double usedUnsignedInt) {
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.allowedUnsignedInt = allowedUnsignedInt;
    this.allowedString = allowedString;
    this.allowedMoney = allowedMoney;
    this.extension = extension;
    this.id = id;
    this.usedMoney = usedMoney;
    this.usedUnsignedInt = usedUnsignedInt;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code allowedString} attribute
   */
  @JsonProperty("allowedString")
  @Override
  public Optional<String> allowedString() {
    return Optional.ofNullable(allowedString);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code usedUnsignedInt} attribute
   */
  @JsonProperty("usedUnsignedInt")
  @Override
  public Optional<Double> usedUnsignedInt() {
    return Optional.ofNullable(usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        newValue,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Financial withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        value,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_Financial#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        newValue,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt} attribute.
   * @param value The value for allowedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withAllowedUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.allowedUnsignedInt, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        newValue,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withAllowedUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.allowedUnsignedInt, value)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        value,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#allowedString() allowedString} attribute.
   * @param value The value for allowedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withAllowedString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "allowedString");
    if (Objects.equals(this.allowedString, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        newValue,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#allowedString() allowedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withAllowedString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.allowedString, value)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        value,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney} attribute.
   * @param value The value for allowedMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withAllowedMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "allowedMoney");
    if (this.allowedMoney == newValue) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        newValue,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Financial withAllowedMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.allowedMoney == value) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        value,
        this.extension,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        newValue,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Financial withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        value,
        this.id,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        newValue,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        value,
        this.usedMoney,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney} attribute.
   * @param value The value for usedMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withUsedMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "usedMoney");
    if (this.usedMoney == newValue) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        newValue,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Financial withUsedMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.usedMoney == value) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        value,
        this.usedUnsignedInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt} attribute.
   * @param value The value for usedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withUsedUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.usedUnsignedInt, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Financial withUsedUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.usedUnsignedInt, value)) return this;
    return new ImmutableExplanationOfBenefit_Financial(
        this.modifierExtension,
        this.type,
        this.allowedUnsignedInt,
        this.allowedString,
        this.allowedMoney,
        this.extension,
        this.id,
        this.usedMoney,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Financial} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Financial
        && equalTo((ImmutableExplanationOfBenefit_Financial) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Financial another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && type.equals(another.type)
        && Objects.equals(allowedUnsignedInt, another.allowedUnsignedInt)
        && Objects.equals(allowedString, another.allowedString)
        && Objects.equals(allowedMoney, another.allowedMoney)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(usedMoney, another.usedMoney)
        && Objects.equals(usedUnsignedInt, another.usedUnsignedInt);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code type}, {@code allowedUnsignedInt}, {@code allowedString}, {@code allowedMoney}, {@code extension}, {@code id}, {@code usedMoney}, {@code usedUnsignedInt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(allowedUnsignedInt);
    h += (h << 5) + Objects.hashCode(allowedString);
    h += (h << 5) + Objects.hashCode(allowedMoney);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(usedMoney);
    h += (h << 5) + Objects.hashCode(usedUnsignedInt);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Financial} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Financial{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("type=").append(type);
    if (allowedUnsignedInt != null) {
      builder.append(", ");
      builder.append("allowedUnsignedInt=").append(allowedUnsignedInt);
    }
    if (allowedString != null) {
      builder.append(", ");
      builder.append("allowedString=").append(allowedString);
    }
    if (allowedMoney != null) {
      builder.append(", ");
      builder.append("allowedMoney=").append(allowedMoney);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (usedMoney != null) {
      builder.append(", ");
      builder.append("usedMoney=").append(usedMoney);
    }
    if (usedUnsignedInt != null) {
      builder.append(", ");
      builder.append("usedUnsignedInt=").append(usedUnsignedInt);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Financial", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Financial {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Double> allowedUnsignedInt = Optional.empty();
    boolean allowedUnsignedIntIsSet;
    @Nullable Optional<String> allowedString = Optional.empty();
    boolean allowedStringIsSet;
    @Nullable Optional<Money> allowedMoney = Optional.empty();
    boolean allowedMoneyIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Money> usedMoney = Optional.empty();
    boolean usedMoneyIsSet;
    @Nullable Optional<Double> usedUnsignedInt = Optional.empty();
    boolean usedUnsignedIntIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("allowedUnsignedInt")
    public void setAllowedUnsignedInt(Optional<Double> allowedUnsignedInt) {
      this.allowedUnsignedInt = allowedUnsignedInt;
      this.allowedUnsignedIntIsSet = true;
    }
    @JsonProperty("allowedString")
    public void setAllowedString(Optional<String> allowedString) {
      this.allowedString = allowedString;
      this.allowedStringIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("usedMoney")
    public void setUsedMoney(Optional<Money> usedMoney) {
      this.usedMoney = usedMoney;
      this.usedMoneyIsSet = true;
    }
    @JsonProperty("usedUnsignedInt")
    public void setUsedUnsignedInt(Optional<Double> usedUnsignedInt) {
      this.usedUnsignedInt = usedUnsignedInt;
      this.usedUnsignedIntIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> allowedUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> allowedString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> allowedMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> usedMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> usedUnsignedInt() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Financial fromJson(Json json) {
    ImmutableExplanationOfBenefit_Financial.Builder builder = ((ImmutableExplanationOfBenefit_Financial.Builder) ImmutableExplanationOfBenefit_Financial.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.allowedUnsignedIntIsSet) {
      builder.allowedUnsignedInt(json.allowedUnsignedInt);
    }
    if (json.allowedStringIsSet) {
      builder.allowedString(json.allowedString);
    }
    if (json.allowedMoneyIsSet) {
      builder.allowedMoney(json.allowedMoney);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.usedMoneyIsSet) {
      builder.usedMoney(json.usedMoney);
    }
    if (json.usedUnsignedIntIsSet) {
      builder.usedUnsignedInt(json.usedUnsignedInt);
    }
    return (ImmutableExplanationOfBenefit_Financial) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Financial} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Financial instance
   */
  public static ExplanationOfBenefit_Financial copyOf(ExplanationOfBenefit_Financial instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Financial) {
      return (ImmutableExplanationOfBenefit_Financial) instance;
    }
    return ((ImmutableExplanationOfBenefit_Financial.Builder) ImmutableExplanationOfBenefit_Financial.builder())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .allowedUnsignedInt(instance.allowedUnsignedInt())
        .allowedString(instance.allowedString())
        .allowedMoney(instance.allowedMoney())
        .extension(instance.extension())
        .id(instance.id())
        .usedMoney(instance.usedMoney())
        .usedUnsignedInt(instance.usedUnsignedInt())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Financial ExplanationOfBenefit_Financial}.
   * <pre>
   * ImmutableExplanationOfBenefit_Financial.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_Financial#type() type}
   *    .allowedUnsignedInt(Double) // optional {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt}
   *    .allowedString(String) // optional {@link ExplanationOfBenefit_Financial#allowedString() allowedString}
   *    .allowedMoney(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Financial#extension() extension}
   *    .id(String) // optional {@link ExplanationOfBenefit_Financial#id() id}
   *    .usedMoney(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney}
   *    .usedUnsignedInt(Double) // optional {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Financial builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableExplanationOfBenefit_Financial.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Financial ExplanationOfBenefit_Financial}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Financial", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ALLOWED_UNSIGNED_INT = 0x2L;
    private static final long OPT_BIT_ALLOWED_STRING = 0x4L;
    private static final long OPT_BIT_ALLOWED_MONEY = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_USED_MONEY = 0x40L;
    private static final long OPT_BIT_USED_UNSIGNED_INT = 0x80L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept type;
    private @Nullable Double allowedUnsignedInt;
    private @Nullable String allowedString;
    private @Nullable Money allowedMoney;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Money usedMoney;
    private @Nullable Double usedUnsignedInt;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ExplanationOfBenefit_Financial#type() type} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedString() allowedString} to allowedString.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedString() allowedString} to allowedString.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney} to allowedMoney.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney} to allowedMoney.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney} to usedMoney.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney} to usedMoney.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
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
     * Builds a new {@link ExplanationOfBenefit_Financial ExplanationOfBenefit_Financial}.
     * @return An immutable instance of ExplanationOfBenefit_Financial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Financial build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_Financial(
          modifierExtension,
          type,
          allowedUnsignedInt,
          allowedString,
          allowedMoney,
          extension,
          id,
          usedMoney,
          usedUnsignedInt);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean allowedUnsignedIntIsSet() {
      return (optBits & OPT_BIT_ALLOWED_UNSIGNED_INT) != 0;
    }

    private boolean allowedStringIsSet() {
      return (optBits & OPT_BIT_ALLOWED_STRING) != 0;
    }

    private boolean allowedMoneyIsSet() {
      return (optBits & OPT_BIT_ALLOWED_MONEY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean usedMoneyIsSet() {
      return (optBits & OPT_BIT_USED_MONEY) != 0;
    }

    private boolean usedUnsignedIntIsSet() {
      return (optBits & OPT_BIT_USED_UNSIGNED_INT) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Financial is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build ExplanationOfBenefit_Financial, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_Financial", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_Financial#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "ExplanationOfBenefit_Financial", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
     * @param allowedUnsignedInt The value for allowedUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedUnsignedInt(double allowedUnsignedInt);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedUnsignedInt() allowedUnsignedInt} to allowedUnsignedInt.
     * @param allowedUnsignedInt The value for allowedUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedUnsignedInt(Optional<Double> allowedUnsignedInt);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedString() allowedString} to allowedString.
     * @param allowedString The value for allowedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedString(String allowedString);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedString() allowedString} to allowedString.
     * @param allowedString The value for allowedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedString(Optional<String> allowedString);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney} to allowedMoney.
     * @param allowedMoney The value for allowedMoney
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedMoney(Money allowedMoney);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#allowedMoney() allowedMoney} to allowedMoney.
     * @param allowedMoney The value for allowedMoney
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedMoney(Optional<? extends Money> allowedMoney);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney} to usedMoney.
     * @param usedMoney The value for usedMoney
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedMoney(Money usedMoney);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedMoney() usedMoney} to usedMoney.
     * @param usedMoney The value for usedMoney
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedMoney(Optional<? extends Money> usedMoney);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
     * @param usedUnsignedInt The value for usedUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedUnsignedInt(double usedUnsignedInt);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Financial#usedUnsignedInt() usedUnsignedInt} to usedUnsignedInt.
     * @param usedUnsignedInt The value for usedUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedUnsignedInt(Optional<Double> usedUnsignedInt);

    /**
     * Builds a new {@link ExplanationOfBenefit_Financial ExplanationOfBenefit_Financial}.
     * @return An immutable instance of ExplanationOfBenefit_Financial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_Financial build();
  }
}
