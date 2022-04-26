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
 * Immutable implementation of {@link MedicationKnowledge_PatientCharacteristics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_PatientCharacteristics.builder()}.
 */
@Generated(from = "MedicationKnowledge_PatientCharacteristics", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_PatientCharacteristics
    implements MedicationKnowledge_PatientCharacteristics {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept characteristicCodeableConcept;
  private final @Nullable Quantity characteristicQuantity;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<String> value;
  private final @Nullable String id;

  private ImmutableMedicationKnowledge_PatientCharacteristics(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept characteristicCodeableConcept,
      @Nullable Quantity characteristicQuantity,
      @Nullable List<Extension> extension,
      @Nullable List<String> value,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.characteristicCodeableConcept = characteristicCodeableConcept;
    this.characteristicQuantity = characteristicQuantity;
    this.extension = extension;
    this.value = value;
    this.id = id;
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
   * @return The value of the {@code characteristicCodeableConcept} attribute
   */
  @JsonProperty("characteristicCodeableConcept")
  @Override
  public Optional<CodeableConcept> characteristicCodeableConcept() {
    return Optional.ofNullable(characteristicCodeableConcept);
  }

  /**
   * @return The value of the {@code characteristicQuantity} attribute
   */
  @JsonProperty("characteristicQuantity")
  @Override
  public Optional<Quantity> characteristicQuantity() {
    return Optional.ofNullable(characteristicQuantity);
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<List<String>> value() {
    return Optional.ofNullable(value);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_PatientCharacteristics#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        newValue,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        this.extension,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_PatientCharacteristics#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_PatientCharacteristics withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        value,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        this.extension,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_PatientCharacteristics#characteristicCodeableConcept() characteristicCodeableConcept} attribute.
   * @param value The value for characteristicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withCharacteristicCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "characteristicCodeableConcept");
    if (this.characteristicCodeableConcept == newValue) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        newValue,
        this.characteristicQuantity,
        this.extension,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_PatientCharacteristics#characteristicCodeableConcept() characteristicCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_PatientCharacteristics withCharacteristicCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.characteristicCodeableConcept == value) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(this.modifierExtension, value, this.characteristicQuantity, this.extension, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_PatientCharacteristics#characteristicQuantity() characteristicQuantity} attribute.
   * @param value The value for characteristicQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withCharacteristicQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "characteristicQuantity");
    if (this.characteristicQuantity == newValue) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        newValue,
        this.extension,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_PatientCharacteristics#characteristicQuantity() characteristicQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristicQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_PatientCharacteristics withCharacteristicQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.characteristicQuantity == value) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        value,
        this.extension,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_PatientCharacteristics#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        newValue,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_PatientCharacteristics#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_PatientCharacteristics withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        value,
        this.value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_PatientCharacteristics#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withValue(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        this.extension,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_PatientCharacteristics#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_PatientCharacteristics withValue(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        this.extension,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_PatientCharacteristics#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        this.extension,
        this.value,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_PatientCharacteristics#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_PatientCharacteristics withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_PatientCharacteristics(
        this.modifierExtension,
        this.characteristicCodeableConcept,
        this.characteristicQuantity,
        this.extension,
        this.value,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_PatientCharacteristics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_PatientCharacteristics
        && equalTo((ImmutableMedicationKnowledge_PatientCharacteristics) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_PatientCharacteristics another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(characteristicCodeableConcept, another.characteristicCodeableConcept)
        && Objects.equals(characteristicQuantity, another.characteristicQuantity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code characteristicCodeableConcept}, {@code characteristicQuantity}, {@code extension}, {@code value}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(characteristicCodeableConcept);
    h += (h << 5) + Objects.hashCode(characteristicQuantity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_PatientCharacteristics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_PatientCharacteristics{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (characteristicCodeableConcept != null) {
      if (builder.length() > 43) builder.append(", ");
      builder.append("characteristicCodeableConcept=").append(characteristicCodeableConcept);
    }
    if (characteristicQuantity != null) {
      if (builder.length() > 43) builder.append(", ");
      builder.append("characteristicQuantity=").append(characteristicQuantity);
    }
    if (extension != null) {
      if (builder.length() > 43) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 43) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 43) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_PatientCharacteristics", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_PatientCharacteristics {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> characteristicCodeableConcept = Optional.empty();
    boolean characteristicCodeableConceptIsSet;
    @Nullable Optional<Quantity> characteristicQuantity = Optional.empty();
    boolean characteristicQuantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<String>> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("characteristicCodeableConcept")
    public void setCharacteristicCodeableConcept(Optional<CodeableConcept> characteristicCodeableConcept) {
      this.characteristicCodeableConcept = characteristicCodeableConcept;
      this.characteristicCodeableConceptIsSet = true;
    }
    @JsonProperty("characteristicQuantity")
    public void setCharacteristicQuantity(Optional<Quantity> characteristicQuantity) {
      this.characteristicQuantity = characteristicQuantity;
      this.characteristicQuantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<List<String>> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> characteristicCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> characteristicQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_PatientCharacteristics fromJson(Json json) {
    ImmutableMedicationKnowledge_PatientCharacteristics.Builder builder = ImmutableMedicationKnowledge_PatientCharacteristics.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.characteristicCodeableConceptIsSet) {
      builder.characteristicCodeableConcept(json.characteristicCodeableConcept);
    }
    if (json.characteristicQuantityIsSet) {
      builder.characteristicQuantity(json.characteristicQuantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMedicationKnowledge_PatientCharacteristics) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_PatientCharacteristics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_PatientCharacteristics instance
   */
  public static MedicationKnowledge_PatientCharacteristics copyOf(MedicationKnowledge_PatientCharacteristics instance) {
    if (instance instanceof ImmutableMedicationKnowledge_PatientCharacteristics) {
      return (ImmutableMedicationKnowledge_PatientCharacteristics) instance;
    }
    return ImmutableMedicationKnowledge_PatientCharacteristics.builder()
        .modifierExtension(instance.modifierExtension())
        .characteristicCodeableConcept(instance.characteristicCodeableConcept())
        .characteristicQuantity(instance.characteristicQuantity())
        .extension(instance.extension())
        .value(instance.value())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_PatientCharacteristics MedicationKnowledge_PatientCharacteristics}.
   * <pre>
   * ImmutableMedicationKnowledge_PatientCharacteristics.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_PatientCharacteristics#modifierExtension() modifierExtension}
   *    .characteristicCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_PatientCharacteristics#characteristicCodeableConcept() characteristicCodeableConcept}
   *    .characteristicQuantity(com.medplum.types.fhir.Quantity) // optional {@link MedicationKnowledge_PatientCharacteristics#characteristicQuantity() characteristicQuantity}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_PatientCharacteristics#extension() extension}
   *    .value(List&amp;lt;String&amp;gt;) // optional {@link MedicationKnowledge_PatientCharacteristics#value() value}
   *    .id(String) // optional {@link MedicationKnowledge_PatientCharacteristics#id() id}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_PatientCharacteristics builder
   */
  public static ImmutableMedicationKnowledge_PatientCharacteristics.Builder builder() {
    return new ImmutableMedicationKnowledge_PatientCharacteristics.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_PatientCharacteristics MedicationKnowledge_PatientCharacteristics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_PatientCharacteristics", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CHARACTERISTIC_CODEABLE_CONCEPT = 0x2L;
    private static final long OPT_BIT_CHARACTERISTIC_QUANTITY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_VALUE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept characteristicCodeableConcept;
    private @Nullable Quantity characteristicQuantity;
    private @Nullable List<Extension> extension;
    private @Nullable List<String> value;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#characteristicCodeableConcept() characteristicCodeableConcept} to characteristicCodeableConcept.
     * @param characteristicCodeableConcept The value for characteristicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristicCodeableConcept(CodeableConcept characteristicCodeableConcept) {
      checkNotIsSet(characteristicCodeableConceptIsSet(), "characteristicCodeableConcept");
      this.characteristicCodeableConcept = Objects.requireNonNull(characteristicCodeableConcept, "characteristicCodeableConcept");
      optBits |= OPT_BIT_CHARACTERISTIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#characteristicCodeableConcept() characteristicCodeableConcept} to characteristicCodeableConcept.
     * @param characteristicCodeableConcept The value for characteristicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("characteristicCodeableConcept")
    public final Builder characteristicCodeableConcept(Optional<? extends CodeableConcept> characteristicCodeableConcept) {
      checkNotIsSet(characteristicCodeableConceptIsSet(), "characteristicCodeableConcept");
      this.characteristicCodeableConcept = characteristicCodeableConcept.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#characteristicQuantity() characteristicQuantity} to characteristicQuantity.
     * @param characteristicQuantity The value for characteristicQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristicQuantity(Quantity characteristicQuantity) {
      checkNotIsSet(characteristicQuantityIsSet(), "characteristicQuantity");
      this.characteristicQuantity = Objects.requireNonNull(characteristicQuantity, "characteristicQuantity");
      optBits |= OPT_BIT_CHARACTERISTIC_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#characteristicQuantity() characteristicQuantity} to characteristicQuantity.
     * @param characteristicQuantity The value for characteristicQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("characteristicQuantity")
    public final Builder characteristicQuantity(Optional<? extends Quantity> characteristicQuantity) {
      checkNotIsSet(characteristicQuantityIsSet(), "characteristicQuantity");
      this.characteristicQuantity = characteristicQuantity.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTIC_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(List<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends List<String>> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_PatientCharacteristics#id() id} to id.
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
     * Builds a new {@link MedicationKnowledge_PatientCharacteristics MedicationKnowledge_PatientCharacteristics}.
     * @return An immutable instance of MedicationKnowledge_PatientCharacteristics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_PatientCharacteristics build() {
      return new ImmutableMedicationKnowledge_PatientCharacteristics(
          modifierExtension,
          characteristicCodeableConcept,
          characteristicQuantity,
          extension,
          value,
          id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean characteristicCodeableConceptIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTIC_CODEABLE_CONCEPT) != 0;
    }

    private boolean characteristicQuantityIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTIC_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_PatientCharacteristics is strict, attribute is already set: ".concat(name));
    }
  }
}
