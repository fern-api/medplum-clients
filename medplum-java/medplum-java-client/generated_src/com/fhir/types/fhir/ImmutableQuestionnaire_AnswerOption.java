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
 * Immutable implementation of {@link Questionnaire_AnswerOption}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaire_AnswerOption.builder()}.
 */
@Generated(from = "Questionnaire_AnswerOption", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaire_AnswerOption
    implements Questionnaire_AnswerOption {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Double valueInteger;
  private final @Nullable Coding valueCoding;
  private final @Nullable Reference valueReference;
  private final @Nullable String valueDate;
  private final @Nullable String valueTime;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean initialSelected;
  private final @Nullable String valueString;

  private ImmutableQuestionnaire_AnswerOption(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Double valueInteger,
      @Nullable Coding valueCoding,
      @Nullable Reference valueReference,
      @Nullable String valueDate,
      @Nullable String valueTime,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean initialSelected,
      @Nullable String valueString) {
    this.id = id;
    this.extension = extension;
    this.valueInteger = valueInteger;
    this.valueCoding = valueCoding;
    this.valueReference = valueReference;
    this.valueDate = valueDate;
    this.valueTime = valueTime;
    this.modifierExtension = modifierExtension;
    this.initialSelected = initialSelected;
    this.valueString = valueString;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueCoding} attribute
   */
  @JsonProperty("valueCoding")
  @Override
  public Optional<Coding> valueCoding() {
    return Optional.ofNullable(valueCoding);
  }

  /**
   * @return The value of the {@code valueReference} attribute
   */
  @JsonProperty("valueReference")
  @Override
  public Optional<Reference> valueReference() {
    return Optional.ofNullable(valueReference);
  }

  /**
   * @return The value of the {@code valueDate} attribute
   */
  @JsonProperty("valueDate")
  @Override
  public Optional<String> valueDate() {
    return Optional.ofNullable(valueDate);
  }

  /**
   * @return The value of the {@code valueTime} attribute
   */
  @JsonProperty("valueTime")
  @Override
  public Optional<String> valueTime() {
    return Optional.ofNullable(valueTime);
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
   * @return The value of the {@code initialSelected} attribute
   */
  @JsonProperty("initialSelected")
  @Override
  public Optional<Boolean> initialSelected() {
    return Optional.ofNullable(initialSelected);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        newValue,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        value,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        newValue,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_AnswerOption withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        value,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        newValue,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        value,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        newValue,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_AnswerOption withValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        value,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        newValue,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_AnswerOption withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        value,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#valueDate() valueDate} attribute.
   * @param value The value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDate");
    if (Objects.equals(this.valueDate, newValue)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        newValue,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#valueDate() valueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDate, value)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        value,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        newValue,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        value,
        this.modifierExtension,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        newValue,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_AnswerOption withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        value,
        this.initialSelected,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#initialSelected() initialSelected} attribute.
   * @param value The value for initialSelected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withInitialSelected(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.initialSelected, newValue)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        newValue,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#initialSelected() initialSelected} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initialSelected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withInitialSelected(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.initialSelected, value)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        value,
        this.valueString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_AnswerOption#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_AnswerOption#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_AnswerOption withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableQuestionnaire_AnswerOption(
        this.id,
        this.extension,
        this.valueInteger,
        this.valueCoding,
        this.valueReference,
        this.valueDate,
        this.valueTime,
        this.modifierExtension,
        this.initialSelected,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaire_AnswerOption} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaire_AnswerOption
        && equalTo((ImmutableQuestionnaire_AnswerOption) another);
  }

  private boolean equalTo(ImmutableQuestionnaire_AnswerOption another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(valueCoding, another.valueCoding)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueDate, another.valueDate)
        && Objects.equals(valueTime, another.valueTime)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(initialSelected, another.initialSelected)
        && Objects.equals(valueString, another.valueString);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code valueInteger}, {@code valueCoding}, {@code valueReference}, {@code valueDate}, {@code valueTime}, {@code modifierExtension}, {@code initialSelected}, {@code valueString}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(valueCoding);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueDate);
    h += (h << 5) + Objects.hashCode(valueTime);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(initialSelected);
    h += (h << 5) + Objects.hashCode(valueString);
    return h;
  }

  /**
   * Prints the immutable value {@code Questionnaire_AnswerOption} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Questionnaire_AnswerOption{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueInteger != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueCoding != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    if (valueReference != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueDate != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueDate=").append(valueDate);
    }
    if (valueTime != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (initialSelected != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("initialSelected=").append(initialSelected);
    }
    if (valueString != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Questionnaire_AnswerOption", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Questionnaire_AnswerOption {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<Coding> valueCoding = Optional.empty();
    boolean valueCodingIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<String> valueDate = Optional.empty();
    boolean valueDateIsSet;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> initialSelected = Optional.empty();
    boolean initialSelectedIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("valueCoding")
    public void setValueCoding(Optional<Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("valueDate")
    public void setValueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      this.valueDateIsSet = true;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("initialSelected")
    public void setInitialSelected(Optional<Boolean> initialSelected) {
      this.initialSelected = initialSelected;
      this.initialSelectedIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> valueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> initialSelected() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaire_AnswerOption fromJson(Json json) {
    ImmutableQuestionnaire_AnswerOption.Builder builder = ImmutableQuestionnaire_AnswerOption.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueDateIsSet) {
      builder.valueDate(json.valueDate);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.initialSelectedIsSet) {
      builder.initialSelected(json.initialSelected);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    return (ImmutableQuestionnaire_AnswerOption) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Questionnaire_AnswerOption} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Questionnaire_AnswerOption instance
   */
  public static Questionnaire_AnswerOption copyOf(Questionnaire_AnswerOption instance) {
    if (instance instanceof ImmutableQuestionnaire_AnswerOption) {
      return (ImmutableQuestionnaire_AnswerOption) instance;
    }
    return ImmutableQuestionnaire_AnswerOption.builder()
        .id(instance.id())
        .extension(instance.extension())
        .valueInteger(instance.valueInteger())
        .valueCoding(instance.valueCoding())
        .valueReference(instance.valueReference())
        .valueDate(instance.valueDate())
        .valueTime(instance.valueTime())
        .modifierExtension(instance.modifierExtension())
        .initialSelected(instance.initialSelected())
        .valueString(instance.valueString())
        .build();
  }

  /**
   * Creates a builder for {@link Questionnaire_AnswerOption Questionnaire_AnswerOption}.
   * <pre>
   * ImmutableQuestionnaire_AnswerOption.builder()
   *    .id(String) // optional {@link Questionnaire_AnswerOption#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Questionnaire_AnswerOption#extension() extension}
   *    .valueInteger(Double) // optional {@link Questionnaire_AnswerOption#valueInteger() valueInteger}
   *    .valueCoding(com.fhir.types.fhir.Coding) // optional {@link Questionnaire_AnswerOption#valueCoding() valueCoding}
   *    .valueReference(com.fhir.types.fhir.Reference) // optional {@link Questionnaire_AnswerOption#valueReference() valueReference}
   *    .valueDate(String) // optional {@link Questionnaire_AnswerOption#valueDate() valueDate}
   *    .valueTime(String) // optional {@link Questionnaire_AnswerOption#valueTime() valueTime}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Questionnaire_AnswerOption#modifierExtension() modifierExtension}
   *    .initialSelected(Boolean) // optional {@link Questionnaire_AnswerOption#initialSelected() initialSelected}
   *    .valueString(String) // optional {@link Questionnaire_AnswerOption#valueString() valueString}
   *    .build();
   * </pre>
   * @return A new Questionnaire_AnswerOption builder
   */
  public static ImmutableQuestionnaire_AnswerOption.Builder builder() {
    return new ImmutableQuestionnaire_AnswerOption.Builder();
  }

  /**
   * Builds instances of type {@link Questionnaire_AnswerOption Questionnaire_AnswerOption}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Questionnaire_AnswerOption", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x4L;
    private static final long OPT_BIT_VALUE_CODING = 0x8L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x10L;
    private static final long OPT_BIT_VALUE_DATE = 0x20L;
    private static final long OPT_BIT_VALUE_TIME = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_INITIAL_SELECTED = 0x100L;
    private static final long OPT_BIT_VALUE_STRING = 0x200L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Double valueInteger;
    private @Nullable Coding valueCoding;
    private @Nullable Reference valueReference;
    private @Nullable String valueDate;
    private @Nullable String valueTime;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean initialSelected;
    private @Nullable String valueString;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_AnswerOption#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_AnswerOption#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_AnswerOption#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCoding(Coding valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = Objects.requireNonNull(valueCoding, "valueCoding");
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCoding")
    public final Builder valueCoding(Optional<? extends Coding> valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = valueCoding.orElse(null);
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueReference(Reference valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = Objects.requireNonNull(valueReference, "valueReference");
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueReference")
    public final Builder valueReference(Optional<? extends Reference> valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = valueReference.orElse(null);
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDate(String valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = Objects.requireNonNull(valueDate, "valueDate");
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDate")
    public final Builder valueDate(Optional<String> valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = valueDate.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTime")
    public final Builder valueTime(Optional<String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_AnswerOption#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_AnswerOption#initialSelected() initialSelected} to initialSelected.
     * @param initialSelected The value for initialSelected
     * @return {@code this} builder for chained invocation
     */
    public final Builder initialSelected(boolean initialSelected) {
      checkNotIsSet(initialSelectedIsSet(), "initialSelected");
      this.initialSelected = initialSelected;
      optBits |= OPT_BIT_INITIAL_SELECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#initialSelected() initialSelected} to initialSelected.
     * @param initialSelected The value for initialSelected
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("initialSelected")
    public final Builder initialSelected(Optional<Boolean> initialSelected) {
      checkNotIsSet(initialSelectedIsSet(), "initialSelected");
      this.initialSelected = initialSelected.orElse(null);
      optBits |= OPT_BIT_INITIAL_SELECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_AnswerOption#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Builds a new {@link Questionnaire_AnswerOption Questionnaire_AnswerOption}.
     * @return An immutable instance of Questionnaire_AnswerOption
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Questionnaire_AnswerOption build() {
      return new ImmutableQuestionnaire_AnswerOption(
          id,
          extension,
          valueInteger,
          valueCoding,
          valueReference,
          valueDate,
          valueTime,
          modifierExtension,
          initialSelected,
          valueString);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueDateIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean initialSelectedIsSet() {
      return (optBits & OPT_BIT_INITIAL_SELECTED) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Questionnaire_AnswerOption is strict, attribute is already set: ".concat(name));
    }
  }
}
