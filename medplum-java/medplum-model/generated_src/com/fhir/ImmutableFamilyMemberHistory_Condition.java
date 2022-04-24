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
 * Immutable implementation of {@link FamilyMemberHistory_Condition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFamilyMemberHistory_Condition.builder()}.
 */
@Generated(from = "FamilyMemberHistory_Condition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableFamilyMemberHistory_Condition implements FamilyMemberHistory_Condition {
  private final @Nullable Boolean contributedToDeath;
  private final @Nullable List<Annotation> note;
  private final CodeableConcept code;
  private final @Nullable Range onsetRange;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable String onsetString;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept outcome;
  private final @Nullable Age onsetAge;
  private final @Nullable Period onsetPeriod;

  private ImmutableFamilyMemberHistory_Condition(
      @Nullable Boolean contributedToDeath,
      @Nullable List<Annotation> note,
      CodeableConcept code,
      @Nullable Range onsetRange,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable String onsetString,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept outcome,
      @Nullable Age onsetAge,
      @Nullable Period onsetPeriod) {
    this.contributedToDeath = contributedToDeath;
    this.note = note;
    this.code = code;
    this.onsetRange = onsetRange;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.onsetString = onsetString;
    this.extension = extension;
    this.outcome = outcome;
    this.onsetAge = onsetAge;
    this.onsetPeriod = onsetPeriod;
  }

  /**
   * @return The value of the {@code contributedToDeath} attribute
   */
  @JsonProperty("contributedToDeath")
  @Override
  public Optional<Boolean> contributedToDeath() {
    return Optional.ofNullable(contributedToDeath);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code onsetRange} attribute
   */
  @JsonProperty("onsetRange")
  @Override
  public Optional<Range> onsetRange() {
    return Optional.ofNullable(onsetRange);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code onsetString} attribute
   */
  @JsonProperty("onsetString")
  @Override
  public Optional<String> onsetString() {
    return Optional.ofNullable(onsetString);
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
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<CodeableConcept> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code onsetAge} attribute
   */
  @JsonProperty("onsetAge")
  @Override
  public Optional<Age> onsetAge() {
    return Optional.ofNullable(onsetAge);
  }

  /**
   * @return The value of the {@code onsetPeriod} attribute
   */
  @JsonProperty("onsetPeriod")
  @Override
  public Optional<Period> onsetPeriod() {
    return Optional.ofNullable(onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath} attribute.
   * @param value The value for contributedToDeath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withContributedToDeath(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.contributedToDeath, newValue)) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        newValue,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contributedToDeath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withContributedToDeath(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.contributedToDeath, value)) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        value,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        newValue,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        value,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FamilyMemberHistory_Condition#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        newValue,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#onsetRange() onsetRange} attribute.
   * @param value The value for onsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withOnsetRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "onsetRange");
    if (this.onsetRange == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        newValue,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#onsetRange() onsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withOnsetRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.onsetRange == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        value,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        newValue,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        value,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        newValue,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        value,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#onsetString() onsetString} attribute.
   * @param value The value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withOnsetString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "onsetString");
    if (Objects.equals(this.onsetString, newValue)) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        newValue,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#onsetString() onsetString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withOnsetString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.onsetString, value)) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        value,
        this.extension,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        newValue,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        value,
        this.outcome,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withOutcome(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        newValue,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withOutcome(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        value,
        this.onsetAge,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#onsetAge() onsetAge} attribute.
   * @param value The value for onsetAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withOnsetAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "onsetAge");
    if (this.onsetAge == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        newValue,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#onsetAge() onsetAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withOnsetAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.onsetAge == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        value,
        this.onsetPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod} attribute.
   * @param value The value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFamilyMemberHistory_Condition withOnsetPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "onsetPeriod");
    if (this.onsetPeriod == newValue) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableFamilyMemberHistory_Condition withOnsetPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.onsetPeriod == value) return this;
    return new ImmutableFamilyMemberHistory_Condition(
        this.contributedToDeath,
        this.note,
        this.code,
        this.onsetRange,
        this.modifierExtension,
        this.id,
        this.onsetString,
        this.extension,
        this.outcome,
        this.onsetAge,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFamilyMemberHistory_Condition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFamilyMemberHistory_Condition
        && equalTo((ImmutableFamilyMemberHistory_Condition) another);
  }

  private boolean equalTo(ImmutableFamilyMemberHistory_Condition another) {
    return Objects.equals(contributedToDeath, another.contributedToDeath)
        && Objects.equals(note, another.note)
        && code.equals(another.code)
        && Objects.equals(onsetRange, another.onsetRange)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(onsetString, another.onsetString)
        && Objects.equals(extension, another.extension)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(onsetAge, another.onsetAge)
        && Objects.equals(onsetPeriod, another.onsetPeriod);
  }

  /**
   * Computes a hash code from attributes: {@code contributedToDeath}, {@code note}, {@code code}, {@code onsetRange}, {@code modifierExtension}, {@code id}, {@code onsetString}, {@code extension}, {@code outcome}, {@code onsetAge}, {@code onsetPeriod}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contributedToDeath);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(onsetRange);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(onsetString);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(onsetAge);
    h += (h << 5) + Objects.hashCode(onsetPeriod);
    return h;
  }

  /**
   * Prints the immutable value {@code FamilyMemberHistory_Condition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("FamilyMemberHistory_Condition{");
    if (contributedToDeath != null) {
      builder.append("contributedToDeath=").append(contributedToDeath);
    }
    if (note != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("code=").append(code);
    if (onsetRange != null) {
      builder.append(", ");
      builder.append("onsetRange=").append(onsetRange);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (onsetString != null) {
      builder.append(", ");
      builder.append("onsetString=").append(onsetString);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (onsetAge != null) {
      builder.append(", ");
      builder.append("onsetAge=").append(onsetAge);
    }
    if (onsetPeriod != null) {
      builder.append(", ");
      builder.append("onsetPeriod=").append(onsetPeriod);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "FamilyMemberHistory_Condition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements FamilyMemberHistory_Condition {
    @Nullable Optional<Boolean> contributedToDeath = Optional.empty();
    boolean contributedToDeathIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<Range> onsetRange = Optional.empty();
    boolean onsetRangeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> onsetString = Optional.empty();
    boolean onsetStringIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<Age> onsetAge = Optional.empty();
    boolean onsetAgeIsSet;
    @Nullable Optional<Period> onsetPeriod = Optional.empty();
    boolean onsetPeriodIsSet;
    @JsonProperty("contributedToDeath")
    public void setContributedToDeath(Optional<Boolean> contributedToDeath) {
      this.contributedToDeath = contributedToDeath;
      this.contributedToDeathIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("onsetRange")
    public void setOnsetRange(Optional<Range> onsetRange) {
      this.onsetRange = onsetRange;
      this.onsetRangeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("onsetString")
    public void setOnsetString(Optional<String> onsetString) {
      this.onsetString = onsetString;
      this.onsetStringIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("onsetAge")
    public void setOnsetAge(Optional<Age> onsetAge) {
      this.onsetAge = onsetAge;
      this.onsetAgeIsSet = true;
    }
    @JsonProperty("onsetPeriod")
    public void setOnsetPeriod(Optional<Period> onsetPeriod) {
      this.onsetPeriod = onsetPeriod;
      this.onsetPeriodIsSet = true;
    }
    @Override
    public Optional<Boolean> contributedToDeath() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> onsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> onsetString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> onsetAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> onsetPeriod() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFamilyMemberHistory_Condition fromJson(Json json) {
    ImmutableFamilyMemberHistory_Condition.Builder builder = ((ImmutableFamilyMemberHistory_Condition.Builder) ImmutableFamilyMemberHistory_Condition.builder());
    if (json.contributedToDeathIsSet) {
      builder.contributedToDeath(json.contributedToDeath);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.onsetRangeIsSet) {
      builder.onsetRange(json.onsetRange);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.onsetStringIsSet) {
      builder.onsetString(json.onsetString);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.onsetAgeIsSet) {
      builder.onsetAge(json.onsetAge);
    }
    if (json.onsetPeriodIsSet) {
      builder.onsetPeriod(json.onsetPeriod);
    }
    return (ImmutableFamilyMemberHistory_Condition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link FamilyMemberHistory_Condition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FamilyMemberHistory_Condition instance
   */
  public static FamilyMemberHistory_Condition copyOf(FamilyMemberHistory_Condition instance) {
    if (instance instanceof ImmutableFamilyMemberHistory_Condition) {
      return (ImmutableFamilyMemberHistory_Condition) instance;
    }
    return ((ImmutableFamilyMemberHistory_Condition.Builder) ImmutableFamilyMemberHistory_Condition.builder())
        .contributedToDeath(instance.contributedToDeath())
        .note(instance.note())
        .code(instance.code())
        .onsetRange(instance.onsetRange())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .onsetString(instance.onsetString())
        .extension(instance.extension())
        .outcome(instance.outcome())
        .onsetAge(instance.onsetAge())
        .onsetPeriod(instance.onsetPeriod())
        .build();
  }

  /**
   * Creates a builder for {@link FamilyMemberHistory_Condition FamilyMemberHistory_Condition}.
   * <pre>
   * ImmutableFamilyMemberHistory_Condition.builder()
   *    .contributedToDeath(Boolean) // optional {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link FamilyMemberHistory_Condition#note() note}
   *    .code(com.fhir.CodeableConcept) // required {@link FamilyMemberHistory_Condition#code() code}
   *    .onsetRange(com.fhir.Range) // optional {@link FamilyMemberHistory_Condition#onsetRange() onsetRange}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link FamilyMemberHistory_Condition#id() id}
   *    .onsetString(String) // optional {@link FamilyMemberHistory_Condition#onsetString() onsetString}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link FamilyMemberHistory_Condition#extension() extension}
   *    .outcome(com.fhir.CodeableConcept) // optional {@link FamilyMemberHistory_Condition#outcome() outcome}
   *    .onsetAge(com.fhir.Age) // optional {@link FamilyMemberHistory_Condition#onsetAge() onsetAge}
   *    .onsetPeriod(com.fhir.Period) // optional {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod}
   *    .build();
   * </pre>
   * @return A new FamilyMemberHistory_Condition builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableFamilyMemberHistory_Condition.Builder();
  }

  /**
   * Builds instances of type {@link FamilyMemberHistory_Condition FamilyMemberHistory_Condition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "FamilyMemberHistory_Condition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_CONTRIBUTED_TO_DEATH = 0x1L;
    private static final long OPT_BIT_NOTE = 0x2L;
    private static final long OPT_BIT_ONSET_RANGE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_ONSET_STRING = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_OUTCOME = 0x80L;
    private static final long OPT_BIT_ONSET_AGE = 0x100L;
    private static final long OPT_BIT_ONSET_PERIOD = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Boolean contributedToDeath;
    private @Nullable List<Annotation> note;
    private @Nullable CodeableConcept code;
    private @Nullable Range onsetRange;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable String onsetString;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept outcome;
    private @Nullable Age onsetAge;
    private @Nullable Period onsetPeriod;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath} to contributedToDeath.
     * @param contributedToDeath The value for contributedToDeath
     * @return {@code this} builder for chained invocation
     */
    public final Builder contributedToDeath(boolean contributedToDeath) {
      checkNotIsSet(contributedToDeathIsSet(), "contributedToDeath");
      this.contributedToDeath = contributedToDeath;
      optBits |= OPT_BIT_CONTRIBUTED_TO_DEATH;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath} to contributedToDeath.
     * @param contributedToDeath The value for contributedToDeath
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contributedToDeath")
    public final Builder contributedToDeath(Optional<Boolean> contributedToDeath) {
      checkNotIsSet(contributedToDeathIsSet(), "contributedToDeath");
      this.contributedToDeath = contributedToDeath.orElse(null);
      optBits |= OPT_BIT_CONTRIBUTED_TO_DEATH;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the value for the {@link FamilyMemberHistory_Condition#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetRange(Range onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = Objects.requireNonNull(onsetRange, "onsetRange");
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetRange")
    public final Builder onsetRange(Optional<? extends Range> onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = onsetRange.orElse(null);
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link FamilyMemberHistory_Condition#id() id} to id.
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
     * Initializes the optional value {@link FamilyMemberHistory_Condition#id() id} to id.
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
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetString(String onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = Objects.requireNonNull(onsetString, "onsetString");
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetString")
    public final Builder onsetString(Optional<String> onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = onsetString.orElse(null);
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link FamilyMemberHistory_Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link FamilyMemberHistory_Condition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(CodeableConcept outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends CodeableConcept> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetAge(Age onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = Objects.requireNonNull(onsetAge, "onsetAge");
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetAge")
    public final Builder onsetAge(Optional<? extends Age> onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = onsetAge.orElse(null);
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetPeriod(Period onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = Objects.requireNonNull(onsetPeriod, "onsetPeriod");
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetPeriod")
    public final Builder onsetPeriod(Optional<? extends Period> onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = onsetPeriod.orElse(null);
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link FamilyMemberHistory_Condition FamilyMemberHistory_Condition}.
     * @return An immutable instance of FamilyMemberHistory_Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public FamilyMemberHistory_Condition build() {
      checkRequiredAttributes();
      return new ImmutableFamilyMemberHistory_Condition(
          contributedToDeath,
          note,
          code,
          onsetRange,
          modifierExtension,
          id,
          onsetString,
          extension,
          outcome,
          onsetAge,
          onsetPeriod);
    }

    private boolean contributedToDeathIsSet() {
      return (optBits & OPT_BIT_CONTRIBUTED_TO_DEATH) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean onsetRangeIsSet() {
      return (optBits & OPT_BIT_ONSET_RANGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean onsetStringIsSet() {
      return (optBits & OPT_BIT_ONSET_STRING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean onsetAgeIsSet() {
      return (optBits & OPT_BIT_ONSET_AGE) != 0;
    }

    private boolean onsetPeriodIsSet() {
      return (optBits & OPT_BIT_ONSET_PERIOD) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of FamilyMemberHistory_Condition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build FamilyMemberHistory_Condition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "FamilyMemberHistory_Condition", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link FamilyMemberHistory_Condition#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "FamilyMemberHistory_Condition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath} to contributedToDeath.
     * @param contributedToDeath The value for contributedToDeath
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contributedToDeath(boolean contributedToDeath);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#contributedToDeath() contributedToDeath} to contributedToDeath.
     * @param contributedToDeath The value for contributedToDeath
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contributedToDeath(Optional<Boolean> contributedToDeath);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetRange(Range onsetRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetRange(Optional<? extends Range> onsetRange);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetString(String onsetString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetString(Optional<String> onsetString);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(CodeableConcept outcome);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends CodeableConcept> outcome);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetAge(Age onsetAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetAge(Optional<? extends Age> onsetAge);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetPeriod(Period onsetPeriod);

    /**
     * Initializes the optional value {@link FamilyMemberHistory_Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetPeriod(Optional<? extends Period> onsetPeriod);

    /**
     * Builds a new {@link FamilyMemberHistory_Condition FamilyMemberHistory_Condition}.
     * @return An immutable instance of FamilyMemberHistory_Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    FamilyMemberHistory_Condition build();
  }
}
