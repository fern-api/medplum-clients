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
 * Immutable implementation of {@link Observation_ReferenceRange}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservation_ReferenceRange.builder()}.
 */
@Generated(from = "Observation_ReferenceRange", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservation_ReferenceRange
    implements Observation_ReferenceRange {
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable Quantity high;
  private final @Nullable List<Extension> extension;
  private final @Nullable String text;
  private final @Nullable List<CodeableConcept> appliesTo;
  private final @Nullable Range age;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity low;

  private ImmutableObservation_ReferenceRange(
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable Quantity high,
      @Nullable List<Extension> extension,
      @Nullable String text,
      @Nullable List<CodeableConcept> appliesTo,
      @Nullable Range age,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity low) {
    this.id = id;
    this.type = type;
    this.high = high;
    this.extension = extension;
    this.text = text;
    this.appliesTo = appliesTo;
    this.age = age;
    this.modifierExtension = modifierExtension;
    this.low = low;
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
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code high} attribute
   */
  @JsonProperty("high")
  @Override
  public Optional<Quantity> high() {
    return Optional.ofNullable(high);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code appliesTo} attribute
   */
  @JsonProperty("appliesTo")
  @Override
  public Optional<List<CodeableConcept>> appliesTo() {
    return Optional.ofNullable(appliesTo);
  }

  /**
   * @return The value of the {@code age} attribute
   */
  @JsonProperty("age")
  @Override
  public Optional<Range> age() {
    return Optional.ofNullable(age);
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
   * @return The value of the {@code low} attribute
   */
  @JsonProperty("low")
  @Override
  public Optional<Quantity> low() {
    return Optional.ofNullable(low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableObservation_ReferenceRange(
        newValue,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableObservation_ReferenceRange(
        value,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        newValue,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        value,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#high() high} attribute.
   * @param value The value for high
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withHigh(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "high");
    if (this.high == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        newValue,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#high() high} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for high
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withHigh(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.high == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        value,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        newValue,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        value,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        newValue,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        value,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#appliesTo() appliesTo} attribute.
   * @param value The value for appliesTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withAppliesTo(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "appliesTo");
    if (this.appliesTo == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        newValue,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#appliesTo() appliesTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appliesTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withAppliesTo(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.appliesTo == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        value,
        this.age,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#age() age} attribute.
   * @param value The value for age
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withAge(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "age");
    if (this.age == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        newValue,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#age() age} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for age
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withAge(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.age == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        value,
        this.modifierExtension,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        newValue,
        this.low);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        value,
        this.low);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_ReferenceRange#low() low} attribute.
   * @param value The value for low
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_ReferenceRange withLow(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "low");
    if (this.low == newValue) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_ReferenceRange#low() low} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for low
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_ReferenceRange withLow(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.low == value) return this;
    return new ImmutableObservation_ReferenceRange(
        this.id,
        this.type,
        this.high,
        this.extension,
        this.text,
        this.appliesTo,
        this.age,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservation_ReferenceRange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservation_ReferenceRange
        && equalTo((ImmutableObservation_ReferenceRange) another);
  }

  private boolean equalTo(ImmutableObservation_ReferenceRange another) {
    return Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(high, another.high)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text)
        && Objects.equals(appliesTo, another.appliesTo)
        && Objects.equals(age, another.age)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(low, another.low);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code type}, {@code high}, {@code extension}, {@code text}, {@code appliesTo}, {@code age}, {@code modifierExtension}, {@code low}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(high);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(appliesTo);
    h += (h << 5) + Objects.hashCode(age);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(low);
    return h;
  }

  /**
   * Prints the immutable value {@code Observation_ReferenceRange} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Observation_ReferenceRange{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (high != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("high=").append(high);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (appliesTo != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("appliesTo=").append(appliesTo);
    }
    if (age != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("age=").append(age);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (low != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("low=").append(low);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Observation_ReferenceRange", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Observation_ReferenceRange {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Quantity> high = Optional.empty();
    boolean highIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<CodeableConcept>> appliesTo = Optional.empty();
    boolean appliesToIsSet;
    @Nullable Optional<Range> age = Optional.empty();
    boolean ageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> low = Optional.empty();
    boolean lowIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("high")
    public void setHigh(Optional<Quantity> high) {
      this.high = high;
      this.highIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("appliesTo")
    public void setAppliesTo(Optional<List<CodeableConcept>> appliesTo) {
      this.appliesTo = appliesTo;
      this.appliesToIsSet = true;
    }
    @JsonProperty("age")
    public void setAge(Optional<Range> age) {
      this.age = age;
      this.ageIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("low")
    public void setLow(Optional<Quantity> low) {
      this.low = low;
      this.lowIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> high() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> appliesTo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> age() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> low() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObservation_ReferenceRange fromJson(Json json) {
    ImmutableObservation_ReferenceRange.Builder builder = ImmutableObservation_ReferenceRange.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.highIsSet) {
      builder.high(json.high);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.appliesToIsSet) {
      builder.appliesTo(json.appliesTo);
    }
    if (json.ageIsSet) {
      builder.age(json.age);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.lowIsSet) {
      builder.low(json.low);
    }
    return (ImmutableObservation_ReferenceRange) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Observation_ReferenceRange} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Observation_ReferenceRange instance
   */
  public static Observation_ReferenceRange copyOf(Observation_ReferenceRange instance) {
    if (instance instanceof ImmutableObservation_ReferenceRange) {
      return (ImmutableObservation_ReferenceRange) instance;
    }
    return ImmutableObservation_ReferenceRange.builder()
        .id(instance.id())
        .type(instance.type())
        .high(instance.high())
        .extension(instance.extension())
        .text(instance.text())
        .appliesTo(instance.appliesTo())
        .age(instance.age())
        .modifierExtension(instance.modifierExtension())
        .low(instance.low())
        .build();
  }

  /**
   * Creates a builder for {@link Observation_ReferenceRange Observation_ReferenceRange}.
   * <pre>
   * ImmutableObservation_ReferenceRange.builder()
   *    .id(String) // optional {@link Observation_ReferenceRange#id() id}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Observation_ReferenceRange#type() type}
   *    .high(com.medplum.types.fhir.Quantity) // optional {@link Observation_ReferenceRange#high() high}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Observation_ReferenceRange#extension() extension}
   *    .text(String) // optional {@link Observation_ReferenceRange#text() text}
   *    .appliesTo(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Observation_ReferenceRange#appliesTo() appliesTo}
   *    .age(com.medplum.types.fhir.Range) // optional {@link Observation_ReferenceRange#age() age}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Observation_ReferenceRange#modifierExtension() modifierExtension}
   *    .low(com.medplum.types.fhir.Quantity) // optional {@link Observation_ReferenceRange#low() low}
   *    .build();
   * </pre>
   * @return A new Observation_ReferenceRange builder
   */
  public static ImmutableObservation_ReferenceRange.Builder builder() {
    return new ImmutableObservation_ReferenceRange.Builder();
  }

  /**
   * Builds instances of type {@link Observation_ReferenceRange Observation_ReferenceRange}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Observation_ReferenceRange", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_HIGH = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_APPLIES_TO = 0x20L;
    private static final long OPT_BIT_AGE = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_LOW = 0x100L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable Quantity high;
    private @Nullable List<Extension> extension;
    private @Nullable String text;
    private @Nullable List<CodeableConcept> appliesTo;
    private @Nullable Range age;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity low;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#id() id} to id.
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
     * Initializes the optional value {@link Observation_ReferenceRange#id() id} to id.
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
     * Initializes the optional value {@link Observation_ReferenceRange#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#high() high} to high.
     * @param high The value for high
     * @return {@code this} builder for chained invocation
     */
    public final Builder high(Quantity high) {
      checkNotIsSet(highIsSet(), "high");
      this.high = Objects.requireNonNull(high, "high");
      optBits |= OPT_BIT_HIGH;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#high() high} to high.
     * @param high The value for high
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("high")
    public final Builder high(Optional<? extends Quantity> high) {
      checkNotIsSet(highIsSet(), "high");
      this.high = high.orElse(null);
      optBits |= OPT_BIT_HIGH;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation_ReferenceRange#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation_ReferenceRange#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#appliesTo() appliesTo} to appliesTo.
     * @param appliesTo The value for appliesTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder appliesTo(List<CodeableConcept> appliesTo) {
      checkNotIsSet(appliesToIsSet(), "appliesTo");
      this.appliesTo = Objects.requireNonNull(appliesTo, "appliesTo");
      optBits |= OPT_BIT_APPLIES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#appliesTo() appliesTo} to appliesTo.
     * @param appliesTo The value for appliesTo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appliesTo")
    public final Builder appliesTo(Optional<? extends List<CodeableConcept>> appliesTo) {
      checkNotIsSet(appliesToIsSet(), "appliesTo");
      this.appliesTo = appliesTo.orElse(null);
      optBits |= OPT_BIT_APPLIES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#age() age} to age.
     * @param age The value for age
     * @return {@code this} builder for chained invocation
     */
    public final Builder age(Range age) {
      checkNotIsSet(ageIsSet(), "age");
      this.age = Objects.requireNonNull(age, "age");
      optBits |= OPT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#age() age} to age.
     * @param age The value for age
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("age")
    public final Builder age(Optional<? extends Range> age) {
      checkNotIsSet(ageIsSet(), "age");
      this.age = age.orElse(null);
      optBits |= OPT_BIT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation_ReferenceRange#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation_ReferenceRange#low() low} to low.
     * @param low The value for low
     * @return {@code this} builder for chained invocation
     */
    public final Builder low(Quantity low) {
      checkNotIsSet(lowIsSet(), "low");
      this.low = Objects.requireNonNull(low, "low");
      optBits |= OPT_BIT_LOW;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_ReferenceRange#low() low} to low.
     * @param low The value for low
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("low")
    public final Builder low(Optional<? extends Quantity> low) {
      checkNotIsSet(lowIsSet(), "low");
      this.low = low.orElse(null);
      optBits |= OPT_BIT_LOW;
      return this;
    }

    /**
     * Builds a new {@link Observation_ReferenceRange Observation_ReferenceRange}.
     * @return An immutable instance of Observation_ReferenceRange
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Observation_ReferenceRange build() {
      return new ImmutableObservation_ReferenceRange(id, type, high, extension, text, appliesTo, age, modifierExtension, low);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean highIsSet() {
      return (optBits & OPT_BIT_HIGH) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean appliesToIsSet() {
      return (optBits & OPT_BIT_APPLIES_TO) != 0;
    }

    private boolean ageIsSet() {
      return (optBits & OPT_BIT_AGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean lowIsSet() {
      return (optBits & OPT_BIT_LOW) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Observation_ReferenceRange is strict, attribute is already set: ".concat(name));
    }
  }
}
