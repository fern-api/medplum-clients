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
 * Immutable implementation of {@link MedicinalProductIndication_OtherTherapy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIndication_OtherTherapy.builder()}.
 */
@Generated(from = "MedicinalProductIndication_OtherTherapy", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIndication_OtherTherapy
    implements MedicinalProductIndication_OtherTherapy {
  private final @Nullable Reference medicationReference;
  private final CodeableConcept therapyRelationshipType;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept medicationCodeableConcept;
  private final @Nullable String id;

  private ImmutableMedicinalProductIndication_OtherTherapy(
      @Nullable Reference medicationReference,
      CodeableConcept therapyRelationshipType,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept medicationCodeableConcept,
      @Nullable String id) {
    this.medicationReference = medicationReference;
    this.therapyRelationshipType = therapyRelationshipType;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.id = id;
  }

  /**
   * @return The value of the {@code medicationReference} attribute
   */
  @JsonProperty("medicationReference")
  @Override
  public Optional<Reference> medicationReference() {
    return Optional.ofNullable(medicationReference);
  }

  /**
   * @return The value of the {@code therapyRelationshipType} attribute
   */
  @JsonProperty("therapyRelationshipType")
  @Override
  public CodeableConcept therapyRelationshipType() {
    return therapyRelationshipType;
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
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @JsonProperty("medicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> medicationCodeableConcept() {
    return Optional.ofNullable(medicationCodeableConcept);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withMedicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        newValue,
        this.therapyRelationshipType,
        this.extension,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication_OtherTherapy withMedicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        value,
        this.therapyRelationshipType,
        this.extension,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIndication_OtherTherapy#therapyRelationshipType() therapyRelationshipType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for therapyRelationshipType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withTherapyRelationshipType(CodeableConcept value) {
    if (this.therapyRelationshipType == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "therapyRelationshipType");
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        newValue,
        this.extension,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication_OtherTherapy#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        newValue,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication_OtherTherapy#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication_OtherTherapy withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        value,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        this.extension,
        newValue,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication_OtherTherapy withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        this.extension,
        value,
        this.medicationCodeableConcept,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withMedicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        this.extension,
        this.modifierExtension,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication_OtherTherapy withMedicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        this.extension,
        this.modifierExtension,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication_OtherTherapy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        this.extension,
        this.modifierExtension,
        this.medicationCodeableConcept,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication_OtherTherapy#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication_OtherTherapy withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductIndication_OtherTherapy(
        this.medicationReference,
        this.therapyRelationshipType,
        this.extension,
        this.modifierExtension,
        this.medicationCodeableConcept,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIndication_OtherTherapy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIndication_OtherTherapy
        && equalTo((ImmutableMedicinalProductIndication_OtherTherapy) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIndication_OtherTherapy another) {
    return Objects.equals(medicationReference, another.medicationReference)
        && therapyRelationshipType.equals(another.therapyRelationshipType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code medicationReference}, {@code therapyRelationshipType}, {@code extension}, {@code modifierExtension}, {@code medicationCodeableConcept}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(medicationReference);
    h += (h << 5) + therapyRelationshipType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIndication_OtherTherapy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductIndication_OtherTherapy{");
    if (medicationReference != null) {
      builder.append("medicationReference=").append(medicationReference);
    }
    if (builder.length() > 40) builder.append(", ");
    builder.append("therapyRelationshipType=").append(therapyRelationshipType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (medicationCodeableConcept != null) {
      builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductIndication_OtherTherapy", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductIndication_OtherTherapy {
    @Nullable Optional<Reference> medicationReference = Optional.empty();
    boolean medicationReferenceIsSet;
    @Nullable CodeableConcept therapyRelationshipType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> medicationCodeableConcept = Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("medicationReference")
    public void setMedicationReference(Optional<Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @JsonProperty("therapyRelationshipType")
    public void setTherapyRelationshipType(CodeableConcept therapyRelationshipType) {
      this.therapyRelationshipType = therapyRelationshipType;
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
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(Optional<CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept therapyRelationshipType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductIndication_OtherTherapy fromJson(Json json) {
    ImmutableMedicinalProductIndication_OtherTherapy.Builder builder = ((ImmutableMedicinalProductIndication_OtherTherapy.Builder) ImmutableMedicinalProductIndication_OtherTherapy.builder());
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.therapyRelationshipType != null) {
      builder.therapyRelationshipType(json.therapyRelationshipType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMedicinalProductIndication_OtherTherapy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIndication_OtherTherapy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIndication_OtherTherapy instance
   */
  public static MedicinalProductIndication_OtherTherapy copyOf(MedicinalProductIndication_OtherTherapy instance) {
    if (instance instanceof ImmutableMedicinalProductIndication_OtherTherapy) {
      return (ImmutableMedicinalProductIndication_OtherTherapy) instance;
    }
    return ((ImmutableMedicinalProductIndication_OtherTherapy.Builder) ImmutableMedicinalProductIndication_OtherTherapy.builder())
        .medicationReference(instance.medicationReference())
        .therapyRelationshipType(instance.therapyRelationshipType())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIndication_OtherTherapy MedicinalProductIndication_OtherTherapy}.
   * <pre>
   * ImmutableMedicinalProductIndication_OtherTherapy.builder()
   *    .medicationReference(com.fhir.Reference) // optional {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference}
   *    .therapyRelationshipType(com.fhir.CodeableConcept) // required {@link MedicinalProductIndication_OtherTherapy#therapyRelationshipType() therapyRelationshipType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIndication_OtherTherapy#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension}
   *    .medicationCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept}
   *    .id(String) // optional {@link MedicinalProductIndication_OtherTherapy#id() id}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIndication_OtherTherapy builder
   */
  public static TherapyRelationshipTypeBuildStage builder() {
    return new ImmutableMedicinalProductIndication_OtherTherapy.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIndication_OtherTherapy MedicinalProductIndication_OtherTherapy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductIndication_OtherTherapy", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TherapyRelationshipTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_THERAPY_RELATIONSHIP_TYPE = 0x1L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference medicationReference;
    private @Nullable CodeableConcept therapyRelationshipType;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept medicationCodeableConcept;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationReference(Reference medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = Objects.requireNonNull(medicationReference, "medicationReference");
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicationReference")
    public final Builder medicationReference(Optional<? extends Reference> medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = medicationReference.orElse(null);
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIndication_OtherTherapy#therapyRelationshipType() therapyRelationshipType} attribute.
     * @param therapyRelationshipType The value for therapyRelationshipType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("therapyRelationshipType")
    public final Builder therapyRelationshipType(CodeableConcept therapyRelationshipType) {
      checkNotIsSet(therapyRelationshipTypeIsSet(), "therapyRelationshipType");
      this.therapyRelationshipType = Objects.requireNonNull(therapyRelationshipType, "therapyRelationshipType");
      initBits &= ~INIT_BIT_THERAPY_RELATIONSHIP_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = Objects.requireNonNull(medicationCodeableConcept, "medicationCodeableConcept");
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicationCodeableConcept")
    public final Builder medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = medicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#id() id} to id.
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
     * Builds a new {@link MedicinalProductIndication_OtherTherapy MedicinalProductIndication_OtherTherapy}.
     * @return An immutable instance of MedicinalProductIndication_OtherTherapy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductIndication_OtherTherapy build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIndication_OtherTherapy(
          medicationReference,
          therapyRelationshipType,
          extension,
          modifierExtension,
          medicationCodeableConcept,
          id);
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean therapyRelationshipTypeIsSet() {
      return (initBits & INIT_BIT_THERAPY_RELATIONSHIP_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductIndication_OtherTherapy is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!therapyRelationshipTypeIsSet()) attributes.add("therapyRelationshipType");
      return "Cannot build MedicinalProductIndication_OtherTherapy, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductIndication_OtherTherapy", generator = "Immutables")
  public interface TherapyRelationshipTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIndication_OtherTherapy#therapyRelationshipType() therapyRelationshipType} attribute.
     * @param therapyRelationshipType The value for therapyRelationshipType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal therapyRelationshipType(CodeableConcept therapyRelationshipType);
  }

  @Generated(from = "MedicinalProductIndication_OtherTherapy", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(Optional<? extends Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductIndication_OtherTherapy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link MedicinalProductIndication_OtherTherapy MedicinalProductIndication_OtherTherapy}.
     * @return An immutable instance of MedicinalProductIndication_OtherTherapy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIndication_OtherTherapy build();
  }
}
