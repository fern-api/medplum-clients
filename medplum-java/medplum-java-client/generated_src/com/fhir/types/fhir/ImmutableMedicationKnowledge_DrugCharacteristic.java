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
 * Immutable implementation of {@link MedicationKnowledge_DrugCharacteristic}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_DrugCharacteristic.builder()}.
 */
@Generated(from = "MedicationKnowledge_DrugCharacteristic", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_DrugCharacteristic
    implements MedicationKnowledge_DrugCharacteristic {
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String valueString;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable String valueBase64Binary;

  private ImmutableMedicationKnowledge_DrugCharacteristic(
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable Quantity valueQuantity,
      @Nullable List<Extension> modifierExtension,
      @Nullable String valueString,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable String valueBase64Binary) {
    this.type = type;
    this.id = id;
    this.valueQuantity = valueQuantity;
    this.modifierExtension = modifierExtension;
    this.valueString = valueString;
    this.valueCodeableConcept = valueCodeableConcept;
    this.extension = extension;
    this.valueBase64Binary = valueBase64Binary;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
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
   * @return The value of the {@code valueBase64Binary} attribute
   */
  @JsonProperty("valueBase64Binary")
  @Override
  public Optional<String> valueBase64Binary() {
    return Optional.ofNullable(valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        newValue,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_DrugCharacteristic withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        value,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        newValue,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        value,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        newValue,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        value,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        newValue,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_DrugCharacteristic withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        value,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        newValue,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        value,
        this.valueCodeableConcept,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        newValue,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        value,
        this.extension,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        newValue,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_DrugCharacteristic withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        value,
        this.valueBase64Binary);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_DrugCharacteristic#valueBase64Binary() valueBase64Binary} attribute.
   * @param value The value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueBase64Binary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueBase64Binary");
    if (Objects.equals(this.valueBase64Binary, newValue)) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_DrugCharacteristic#valueBase64Binary() valueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_DrugCharacteristic withValueBase64Binary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueBase64Binary, value)) return this;
    return new ImmutableMedicationKnowledge_DrugCharacteristic(
        this.type,
        this.id,
        this.valueQuantity,
        this.modifierExtension,
        this.valueString,
        this.valueCodeableConcept,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_DrugCharacteristic} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_DrugCharacteristic
        && equalTo((ImmutableMedicationKnowledge_DrugCharacteristic) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_DrugCharacteristic another) {
    return Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valueBase64Binary, another.valueBase64Binary);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code id}, {@code valueQuantity}, {@code modifierExtension}, {@code valueString}, {@code valueCodeableConcept}, {@code extension}, {@code valueBase64Binary}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueBase64Binary);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_DrugCharacteristic} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_DrugCharacteristic{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueQuantity != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (modifierExtension != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueString != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueBase64Binary != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("valueBase64Binary=").append(valueBase64Binary);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_DrugCharacteristic", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_DrugCharacteristic {
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> valueBase64Binary = Optional.empty();
    boolean valueBase64BinaryIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(Optional<String> valueBase64Binary) {
      this.valueBase64Binary = valueBase64Binary;
      this.valueBase64BinaryIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueBase64Binary() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_DrugCharacteristic fromJson(Json json) {
    ImmutableMedicationKnowledge_DrugCharacteristic.Builder builder = ImmutableMedicationKnowledge_DrugCharacteristic.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueBase64BinaryIsSet) {
      builder.valueBase64Binary(json.valueBase64Binary);
    }
    return (ImmutableMedicationKnowledge_DrugCharacteristic) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_DrugCharacteristic} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_DrugCharacteristic instance
   */
  public static MedicationKnowledge_DrugCharacteristic copyOf(MedicationKnowledge_DrugCharacteristic instance) {
    if (instance instanceof ImmutableMedicationKnowledge_DrugCharacteristic) {
      return (ImmutableMedicationKnowledge_DrugCharacteristic) instance;
    }
    return ImmutableMedicationKnowledge_DrugCharacteristic.builder()
        .type(instance.type())
        .id(instance.id())
        .valueQuantity(instance.valueQuantity())
        .modifierExtension(instance.modifierExtension())
        .valueString(instance.valueString())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .extension(instance.extension())
        .valueBase64Binary(instance.valueBase64Binary())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_DrugCharacteristic MedicationKnowledge_DrugCharacteristic}.
   * <pre>
   * ImmutableMedicationKnowledge_DrugCharacteristic.builder()
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_DrugCharacteristic#type() type}
   *    .id(String) // optional {@link MedicationKnowledge_DrugCharacteristic#id() id}
   *    .valueQuantity(com.fhir.types.fhir.Quantity) // optional {@link MedicationKnowledge_DrugCharacteristic#valueQuantity() valueQuantity}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_DrugCharacteristic#modifierExtension() modifierExtension}
   *    .valueString(String) // optional {@link MedicationKnowledge_DrugCharacteristic#valueString() valueString}
   *    .valueCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_DrugCharacteristic#valueCodeableConcept() valueCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_DrugCharacteristic#extension() extension}
   *    .valueBase64Binary(String) // optional {@link MedicationKnowledge_DrugCharacteristic#valueBase64Binary() valueBase64Binary}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_DrugCharacteristic builder
   */
  public static ImmutableMedicationKnowledge_DrugCharacteristic.Builder builder() {
    return new ImmutableMedicationKnowledge_DrugCharacteristic.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_DrugCharacteristic MedicationKnowledge_DrugCharacteristic}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_DrugCharacteristic", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_VALUE_STRING = 0x10L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_VALUE_BASE64_BINARY = 0x80L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable Quantity valueQuantity;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String valueString;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable String valueBase64Binary;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#type() type} to type.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#type() type} to type.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBase64Binary(String valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = Objects.requireNonNull(valueBase64Binary, "valueBase64Binary");
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_DrugCharacteristic#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBase64Binary")
    public final Builder valueBase64Binary(Optional<String> valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = valueBase64Binary.orElse(null);
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_DrugCharacteristic MedicationKnowledge_DrugCharacteristic}.
     * @return An immutable instance of MedicationKnowledge_DrugCharacteristic
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_DrugCharacteristic build() {
      return new ImmutableMedicationKnowledge_DrugCharacteristic(
          type,
          id,
          valueQuantity,
          modifierExtension,
          valueString,
          valueCodeableConcept,
          extension,
          valueBase64Binary);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_VALUE_BASE64_BINARY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_DrugCharacteristic is strict, attribute is already set: ".concat(name));
    }
  }
}
