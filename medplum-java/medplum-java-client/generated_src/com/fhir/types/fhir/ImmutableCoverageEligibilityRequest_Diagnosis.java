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
 * Immutable implementation of {@link CoverageEligibilityRequest_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityRequest_Diagnosis.builder()}.
 */
@Generated(from = "CoverageEligibilityRequest_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityRequest_Diagnosis
    implements CoverageEligibilityRequest_Diagnosis {
  private final @Nullable CodeableConcept diagnosisCodeableConcept;
  private final @Nullable Reference diagnosisReference;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableCoverageEligibilityRequest_Diagnosis(
      @Nullable CodeableConcept diagnosisCodeableConcept,
      @Nullable Reference diagnosisReference,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.diagnosisCodeableConcept = diagnosisCodeableConcept;
    this.diagnosisReference = diagnosisReference;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code diagnosisCodeableConcept} attribute
   */
  @JsonProperty("diagnosisCodeableConcept")
  @Override
  public Optional<CodeableConcept> diagnosisCodeableConcept() {
    return Optional.ofNullable(diagnosisCodeableConcept);
  }

  /**
   * @return The value of the {@code diagnosisReference} attribute
   */
  @JsonProperty("diagnosisReference")
  @Override
  public Optional<Reference> diagnosisReference() {
    return Optional.ofNullable(diagnosisReference);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * @param value The value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Diagnosis withDiagnosisCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "diagnosisCodeableConcept");
    if (this.diagnosisCodeableConcept == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(newValue, this.diagnosisReference, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Diagnosis withDiagnosisCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.diagnosisCodeableConcept == value) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(value, this.diagnosisReference, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * @param value The value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Diagnosis withDiagnosisReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "diagnosisReference");
    if (this.diagnosisReference == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(this.diagnosisCodeableConcept, newValue, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Diagnosis withDiagnosisReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.diagnosisReference == value) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(this.diagnosisCodeableConcept, value, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Diagnosis withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(
        this.diagnosisCodeableConcept,
        this.diagnosisReference,
        newValue,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Diagnosis withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(
        this.diagnosisCodeableConcept,
        this.diagnosisReference,
        value,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Diagnosis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(
        this.diagnosisCodeableConcept,
        this.diagnosisReference,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Diagnosis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(this.diagnosisCodeableConcept, this.diagnosisReference, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Diagnosis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(this.diagnosisCodeableConcept, this.diagnosisReference, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Diagnosis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityRequest_Diagnosis(this.diagnosisCodeableConcept, this.diagnosisReference, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityRequest_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityRequest_Diagnosis
        && equalTo((ImmutableCoverageEligibilityRequest_Diagnosis) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityRequest_Diagnosis another) {
    return Objects.equals(diagnosisCodeableConcept, another.diagnosisCodeableConcept)
        && Objects.equals(diagnosisReference, another.diagnosisReference)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code diagnosisCodeableConcept}, {@code diagnosisReference}, {@code id}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(diagnosisCodeableConcept);
    h += (h << 5) + Objects.hashCode(diagnosisReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityRequest_Diagnosis{");
    if (diagnosisCodeableConcept != null) {
      builder.append("diagnosisCodeableConcept=").append(diagnosisCodeableConcept);
    }
    if (diagnosisReference != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("diagnosisReference=").append(diagnosisReference);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityRequest_Diagnosis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityRequest_Diagnosis {
    @Nullable Optional<CodeableConcept> diagnosisCodeableConcept = Optional.empty();
    boolean diagnosisCodeableConceptIsSet;
    @Nullable Optional<Reference> diagnosisReference = Optional.empty();
    boolean diagnosisReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("diagnosisCodeableConcept")
    public void setDiagnosisCodeableConcept(Optional<CodeableConcept> diagnosisCodeableConcept) {
      this.diagnosisCodeableConcept = diagnosisCodeableConcept;
      this.diagnosisCodeableConceptIsSet = true;
    }
    @JsonProperty("diagnosisReference")
    public void setDiagnosisReference(Optional<Reference> diagnosisReference) {
      this.diagnosisReference = diagnosisReference;
      this.diagnosisReferenceIsSet = true;
    }
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> diagnosisCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> diagnosisReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableCoverageEligibilityRequest_Diagnosis fromJson(Json json) {
    ImmutableCoverageEligibilityRequest_Diagnosis.Builder builder = ImmutableCoverageEligibilityRequest_Diagnosis.builder();
    if (json.diagnosisCodeableConceptIsSet) {
      builder.diagnosisCodeableConcept(json.diagnosisCodeableConcept);
    }
    if (json.diagnosisReferenceIsSet) {
      builder.diagnosisReference(json.diagnosisReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableCoverageEligibilityRequest_Diagnosis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityRequest_Diagnosis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityRequest_Diagnosis instance
   */
  public static CoverageEligibilityRequest_Diagnosis copyOf(CoverageEligibilityRequest_Diagnosis instance) {
    if (instance instanceof ImmutableCoverageEligibilityRequest_Diagnosis) {
      return (ImmutableCoverageEligibilityRequest_Diagnosis) instance;
    }
    return ImmutableCoverageEligibilityRequest_Diagnosis.builder()
        .diagnosisCodeableConcept(instance.diagnosisCodeableConcept())
        .diagnosisReference(instance.diagnosisReference())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest_Diagnosis CoverageEligibilityRequest_Diagnosis}.
   * <pre>
   * ImmutableCoverageEligibilityRequest_Diagnosis.builder()
   *    .diagnosisCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityRequest_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept}
   *    .diagnosisReference(com.fhir.types.fhir.Reference) // optional {@link CoverageEligibilityRequest_Diagnosis#diagnosisReference() diagnosisReference}
   *    .id(String) // optional {@link CoverageEligibilityRequest_Diagnosis#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_Diagnosis#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_Diagnosis#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityRequest_Diagnosis builder
   */
  public static ImmutableCoverageEligibilityRequest_Diagnosis.Builder builder() {
    return new ImmutableCoverageEligibilityRequest_Diagnosis.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityRequest_Diagnosis CoverageEligibilityRequest_Diagnosis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoverageEligibilityRequest_Diagnosis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_DIAGNOSIS_REFERENCE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable CodeableConcept diagnosisCodeableConcept;
    private @Nullable Reference diagnosisReference;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
     * @param diagnosisCodeableConcept The value for diagnosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisCodeableConcept(CodeableConcept diagnosisCodeableConcept) {
      checkNotIsSet(diagnosisCodeableConceptIsSet(), "diagnosisCodeableConcept");
      this.diagnosisCodeableConcept = Objects.requireNonNull(diagnosisCodeableConcept, "diagnosisCodeableConcept");
      optBits |= OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
     * @param diagnosisCodeableConcept The value for diagnosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosisCodeableConcept")
    public final Builder diagnosisCodeableConcept(Optional<? extends CodeableConcept> diagnosisCodeableConcept) {
      checkNotIsSet(diagnosisCodeableConceptIsSet(), "diagnosisCodeableConcept");
      this.diagnosisCodeableConcept = diagnosisCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
     * @param diagnosisReference The value for diagnosisReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisReference(Reference diagnosisReference) {
      checkNotIsSet(diagnosisReferenceIsSet(), "diagnosisReference");
      this.diagnosisReference = Objects.requireNonNull(diagnosisReference, "diagnosisReference");
      optBits |= OPT_BIT_DIAGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
     * @param diagnosisReference The value for diagnosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosisReference")
    public final Builder diagnosisReference(Optional<? extends Reference> diagnosisReference) {
      checkNotIsSet(diagnosisReferenceIsSet(), "diagnosisReference");
      this.diagnosisReference = diagnosisReference.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link CoverageEligibilityRequest_Diagnosis CoverageEligibilityRequest_Diagnosis}.
     * @return An immutable instance of CoverageEligibilityRequest_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityRequest_Diagnosis build() {
      return new ImmutableCoverageEligibilityRequest_Diagnosis(diagnosisCodeableConcept, diagnosisReference, id, extension, modifierExtension);
    }

    private boolean diagnosisCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT) != 0;
    }

    private boolean diagnosisReferenceIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityRequest_Diagnosis is strict, attribute is already set: ".concat(name));
    }
  }
}
