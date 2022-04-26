package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ObservationDefinition_QualifiedInterval}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservationDefinition_QualifiedInterval.builder()}.
 */
@Generated(from = "ObservationDefinition_QualifiedInterval", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservationDefinition_QualifiedInterval
    implements ObservationDefinition_QualifiedInterval {
  private final @Nullable Observationdefinition_QualifiedintervalCategory category;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Observationdefinition_QualifiedintervalGender gender;
  private final @Nullable List<CodeableConcept> appliesTo;
  private final @Nullable String id;
  private final @Nullable Range age;
  private final @Nullable CodeableConcept context;
  private final @Nullable List<Extension> extension;
  private final @Nullable Range range;
  private final @Nullable String condition;
  private final @Nullable Range gestationalAge;

  private ImmutableObservationDefinition_QualifiedInterval(
      @Nullable Observationdefinition_QualifiedintervalCategory category,
      @Nullable List<Extension> modifierExtension,
      @Nullable Observationdefinition_QualifiedintervalGender gender,
      @Nullable List<CodeableConcept> appliesTo,
      @Nullable String id,
      @Nullable Range age,
      @Nullable CodeableConcept context,
      @Nullable List<Extension> extension,
      @Nullable Range range,
      @Nullable String condition,
      @Nullable Range gestationalAge) {
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.gender = gender;
    this.appliesTo = appliesTo;
    this.id = id;
    this.age = age;
    this.context = context;
    this.extension = extension;
    this.range = range;
    this.condition = condition;
    this.gestationalAge = gestationalAge;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<Observationdefinition_QualifiedintervalCategory> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public Optional<Observationdefinition_QualifiedintervalGender> gender() {
    return Optional.ofNullable(gender);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<CodeableConcept> context() {
    return Optional.ofNullable(context);
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
   * @return The value of the {@code range} attribute
   */
  @JsonProperty("range")
  @Override
  public Optional<Range> range() {
    return Optional.ofNullable(range);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<String> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code gestationalAge} attribute
   */
  @JsonProperty("gestationalAge")
  @Override
  public Optional<Range> gestationalAge() {
    return Optional.ofNullable(gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withCategory(Observationdefinition_QualifiedintervalCategory value) {
    @Nullable Observationdefinition_QualifiedintervalCategory newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        newValue,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withCategory(Optional<? extends Observationdefinition_QualifiedintervalCategory> optional) {
    @Nullable Observationdefinition_QualifiedintervalCategory value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        value,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        newValue,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        value,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withGender(Observationdefinition_QualifiedintervalGender value) {
    @Nullable Observationdefinition_QualifiedintervalGender newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        newValue,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withGender(Optional<? extends Observationdefinition_QualifiedintervalGender> optional) {
    @Nullable Observationdefinition_QualifiedintervalGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        value,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#appliesTo() appliesTo} attribute.
   * @param value The value for appliesTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withAppliesTo(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "appliesTo");
    if (this.appliesTo == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        newValue,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#appliesTo() appliesTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appliesTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withAppliesTo(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.appliesTo == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        value,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        newValue,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        value,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#age() age} attribute.
   * @param value The value for age
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withAge(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "age");
    if (this.age == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        newValue,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#age() age} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for age
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withAge(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.age == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        value,
        this.context,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withContext(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        newValue,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withContext(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        value,
        this.extension,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        newValue,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        value,
        this.range,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#range() range} attribute.
   * @param value The value for range
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "range");
    if (this.range == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        newValue,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#range() range} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for range
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.range == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        value,
        this.condition,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withCondition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "condition");
    if (Objects.equals(this.condition, newValue)) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        newValue,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#condition() condition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withCondition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.condition, value)) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        value,
        this.gestationalAge);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QualifiedInterval#gestationalAge() gestationalAge} attribute.
   * @param value The value for gestationalAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QualifiedInterval withGestationalAge(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "gestationalAge");
    if (this.gestationalAge == newValue) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QualifiedInterval#gestationalAge() gestationalAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gestationalAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QualifiedInterval withGestationalAge(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.gestationalAge == value) return this;
    return new ImmutableObservationDefinition_QualifiedInterval(
        this.category,
        this.modifierExtension,
        this.gender,
        this.appliesTo,
        this.id,
        this.age,
        this.context,
        this.extension,
        this.range,
        this.condition,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservationDefinition_QualifiedInterval} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservationDefinition_QualifiedInterval
        && equalTo((ImmutableObservationDefinition_QualifiedInterval) another);
  }

  private boolean equalTo(ImmutableObservationDefinition_QualifiedInterval another) {
    return Objects.equals(category, another.category)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(gender, another.gender)
        && Objects.equals(appliesTo, another.appliesTo)
        && Objects.equals(id, another.id)
        && Objects.equals(age, another.age)
        && Objects.equals(context, another.context)
        && Objects.equals(extension, another.extension)
        && Objects.equals(range, another.range)
        && Objects.equals(condition, another.condition)
        && Objects.equals(gestationalAge, another.gestationalAge);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code modifierExtension}, {@code gender}, {@code appliesTo}, {@code id}, {@code age}, {@code context}, {@code extension}, {@code range}, {@code condition}, {@code gestationalAge}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + Objects.hashCode(appliesTo);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(age);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(range);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(gestationalAge);
    return h;
  }

  /**
   * Prints the immutable value {@code ObservationDefinition_QualifiedInterval} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ObservationDefinition_QualifiedInterval{");
    if (category != null) {
      builder.append("category=").append(category);
    }
    if (modifierExtension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (gender != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (appliesTo != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("appliesTo=").append(appliesTo);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (age != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("age=").append(age);
    }
    if (context != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (range != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("range=").append(range);
    }
    if (condition != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (gestationalAge != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("gestationalAge=").append(gestationalAge);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ObservationDefinition_QualifiedInterval", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ObservationDefinition_QualifiedInterval {
    @Nullable Optional<Observationdefinition_QualifiedintervalCategory> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Observationdefinition_QualifiedintervalGender> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable Optional<List<CodeableConcept>> appliesTo = Optional.empty();
    boolean appliesToIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Range> age = Optional.empty();
    boolean ageIsSet;
    @Nullable Optional<CodeableConcept> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Range> range = Optional.empty();
    boolean rangeIsSet;
    @Nullable Optional<String> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<Range> gestationalAge = Optional.empty();
    boolean gestationalAgeIsSet;
    @JsonProperty("category")
    public void setCategory(Optional<Observationdefinition_QualifiedintervalCategory> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("gender")
    public void setGender(Optional<Observationdefinition_QualifiedintervalGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("appliesTo")
    public void setAppliesTo(Optional<List<CodeableConcept>> appliesTo) {
      this.appliesTo = appliesTo;
      this.appliesToIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("age")
    public void setAge(Optional<Range> age) {
      this.age = age;
      this.ageIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<CodeableConcept> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("range")
    public void setRange(Optional<Range> range) {
      this.range = range;
      this.rangeIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<String> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("gestationalAge")
    public void setGestationalAge(Optional<Range> gestationalAge) {
      this.gestationalAge = gestationalAge;
      this.gestationalAgeIsSet = true;
    }
    @Override
    public Optional<Observationdefinition_QualifiedintervalCategory> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Observationdefinition_QualifiedintervalGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> appliesTo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> age() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> range() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> gestationalAge() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObservationDefinition_QualifiedInterval fromJson(Json json) {
    ImmutableObservationDefinition_QualifiedInterval.Builder builder = ImmutableObservationDefinition_QualifiedInterval.builder();
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.appliesToIsSet) {
      builder.appliesTo(json.appliesTo);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.ageIsSet) {
      builder.age(json.age);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.rangeIsSet) {
      builder.range(json.range);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.gestationalAgeIsSet) {
      builder.gestationalAge(json.gestationalAge);
    }
    return (ImmutableObservationDefinition_QualifiedInterval) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ObservationDefinition_QualifiedInterval} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ObservationDefinition_QualifiedInterval instance
   */
  public static ObservationDefinition_QualifiedInterval copyOf(ObservationDefinition_QualifiedInterval instance) {
    if (instance instanceof ImmutableObservationDefinition_QualifiedInterval) {
      return (ImmutableObservationDefinition_QualifiedInterval) instance;
    }
    return ImmutableObservationDefinition_QualifiedInterval.builder()
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .gender(instance.gender())
        .appliesTo(instance.appliesTo())
        .id(instance.id())
        .age(instance.age())
        .context(instance.context())
        .extension(instance.extension())
        .range(instance.range())
        .condition(instance.condition())
        .gestationalAge(instance.gestationalAge())
        .build();
  }

  /**
   * Creates a builder for {@link ObservationDefinition_QualifiedInterval ObservationDefinition_QualifiedInterval}.
   * <pre>
   * ImmutableObservationDefinition_QualifiedInterval.builder()
   *    .category(Observationdefinition_QualifiedintervalCategory) // optional {@link ObservationDefinition_QualifiedInterval#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition_QualifiedInterval#modifierExtension() modifierExtension}
   *    .gender(Observationdefinition_QualifiedintervalGender) // optional {@link ObservationDefinition_QualifiedInterval#gender() gender}
   *    .appliesTo(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ObservationDefinition_QualifiedInterval#appliesTo() appliesTo}
   *    .id(String) // optional {@link ObservationDefinition_QualifiedInterval#id() id}
   *    .age(com.fhir.types.fhir.Range) // optional {@link ObservationDefinition_QualifiedInterval#age() age}
   *    .context(com.fhir.types.fhir.CodeableConcept) // optional {@link ObservationDefinition_QualifiedInterval#context() context}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition_QualifiedInterval#extension() extension}
   *    .range(com.fhir.types.fhir.Range) // optional {@link ObservationDefinition_QualifiedInterval#range() range}
   *    .condition(String) // optional {@link ObservationDefinition_QualifiedInterval#condition() condition}
   *    .gestationalAge(com.fhir.types.fhir.Range) // optional {@link ObservationDefinition_QualifiedInterval#gestationalAge() gestationalAge}
   *    .build();
   * </pre>
   * @return A new ObservationDefinition_QualifiedInterval builder
   */
  public static ImmutableObservationDefinition_QualifiedInterval.Builder builder() {
    return new ImmutableObservationDefinition_QualifiedInterval.Builder();
  }

  /**
   * Builds instances of type {@link ObservationDefinition_QualifiedInterval ObservationDefinition_QualifiedInterval}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ObservationDefinition_QualifiedInterval", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_GENDER = 0x4L;
    private static final long OPT_BIT_APPLIES_TO = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_AGE = 0x20L;
    private static final long OPT_BIT_CONTEXT = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_RANGE = 0x100L;
    private static final long OPT_BIT_CONDITION = 0x200L;
    private static final long OPT_BIT_GESTATIONAL_AGE = 0x400L;
    private long optBits;

    private @Nullable Observationdefinition_QualifiedintervalCategory category;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Observationdefinition_QualifiedintervalGender gender;
    private @Nullable List<CodeableConcept> appliesTo;
    private @Nullable String id;
    private @Nullable Range age;
    private @Nullable CodeableConcept context;
    private @Nullable List<Extension> extension;
    private @Nullable Range range;
    private @Nullable String condition;
    private @Nullable Range gestationalAge;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(Observationdefinition_QualifiedintervalCategory category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends Observationdefinition_QualifiedintervalCategory> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(Observationdefinition_QualifiedintervalGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends Observationdefinition_QualifiedintervalGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#appliesTo() appliesTo} to appliesTo.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#appliesTo() appliesTo} to appliesTo.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#id() id} to id.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#id() id} to id.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#age() age} to age.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#age() age} to age.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(CodeableConcept context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends CodeableConcept> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#range() range} to range.
     * @param range The value for range
     * @return {@code this} builder for chained invocation
     */
    public final Builder range(Range range) {
      checkNotIsSet(rangeIsSet(), "range");
      this.range = Objects.requireNonNull(range, "range");
      optBits |= OPT_BIT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#range() range} to range.
     * @param range The value for range
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("range")
    public final Builder range(Optional<? extends Range> range) {
      checkNotIsSet(rangeIsSet(), "range");
      this.range = range.orElse(null);
      optBits |= OPT_BIT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(String condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<String> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#gestationalAge() gestationalAge} to gestationalAge.
     * @param gestationalAge The value for gestationalAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder gestationalAge(Range gestationalAge) {
      checkNotIsSet(gestationalAgeIsSet(), "gestationalAge");
      this.gestationalAge = Objects.requireNonNull(gestationalAge, "gestationalAge");
      optBits |= OPT_BIT_GESTATIONAL_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QualifiedInterval#gestationalAge() gestationalAge} to gestationalAge.
     * @param gestationalAge The value for gestationalAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gestationalAge")
    public final Builder gestationalAge(Optional<? extends Range> gestationalAge) {
      checkNotIsSet(gestationalAgeIsSet(), "gestationalAge");
      this.gestationalAge = gestationalAge.orElse(null);
      optBits |= OPT_BIT_GESTATIONAL_AGE;
      return this;
    }

    /**
     * Builds a new {@link ObservationDefinition_QualifiedInterval ObservationDefinition_QualifiedInterval}.
     * @return An immutable instance of ObservationDefinition_QualifiedInterval
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ObservationDefinition_QualifiedInterval build() {
      return new ImmutableObservationDefinition_QualifiedInterval(
          category,
          modifierExtension,
          gender,
          appliesTo,
          id,
          age,
          context,
          extension,
          range,
          condition,
          gestationalAge);
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean appliesToIsSet() {
      return (optBits & OPT_BIT_APPLIES_TO) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean ageIsSet() {
      return (optBits & OPT_BIT_AGE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean rangeIsSet() {
      return (optBits & OPT_BIT_RANGE) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean gestationalAgeIsSet() {
      return (optBits & OPT_BIT_GESTATIONAL_AGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ObservationDefinition_QualifiedInterval is strict, attribute is already set: ".concat(name));
    }
  }
}
