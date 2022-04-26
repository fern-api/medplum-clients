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
 * Immutable implementation of {@link ClinicalImpression_Finding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClinicalImpression_Finding.builder()}.
 */
@Generated(from = "ClinicalImpression_Finding", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClinicalImpression_Finding
    implements ClinicalImpression_Finding {
  private final @Nullable Reference itemReference;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String basis;
  private final @Nullable CodeableConcept itemCodeableConcept;
  private final @Nullable List<Extension> extension;

  private ImmutableClinicalImpression_Finding(
      @Nullable Reference itemReference,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String basis,
      @Nullable CodeableConcept itemCodeableConcept,
      @Nullable List<Extension> extension) {
    this.itemReference = itemReference;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.basis = basis;
    this.itemCodeableConcept = itemCodeableConcept;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code itemReference} attribute
   */
  @JsonProperty("itemReference")
  @Override
  public Optional<Reference> itemReference() {
    return Optional.ofNullable(itemReference);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code basis} attribute
   */
  @JsonProperty("basis")
  @Override
  public Optional<String> basis() {
    return Optional.ofNullable(basis);
  }

  /**
   * @return The value of the {@code itemCodeableConcept} attribute
   */
  @JsonProperty("itemCodeableConcept")
  @Override
  public Optional<CodeableConcept> itemCodeableConcept() {
    return Optional.ofNullable(itemCodeableConcept);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression_Finding#itemReference() itemReference} attribute.
   * @param value The value for itemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withItemReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "itemReference");
    if (this.itemReference == newValue) return this;
    return new ImmutableClinicalImpression_Finding(newValue, this.id, this.modifierExtension, this.basis, this.itemCodeableConcept, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression_Finding#itemReference() itemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression_Finding withItemReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.itemReference == value) return this;
    return new ImmutableClinicalImpression_Finding(value, this.id, this.modifierExtension, this.basis, this.itemCodeableConcept, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression_Finding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClinicalImpression_Finding(
        this.itemReference,
        newValue,
        this.modifierExtension,
        this.basis,
        this.itemCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression_Finding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClinicalImpression_Finding(
        this.itemReference,
        value,
        this.modifierExtension,
        this.basis,
        this.itemCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression_Finding#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClinicalImpression_Finding(this.itemReference, this.id, newValue, this.basis, this.itemCodeableConcept, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression_Finding#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression_Finding withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClinicalImpression_Finding(this.itemReference, this.id, value, this.basis, this.itemCodeableConcept, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression_Finding#basis() basis} attribute.
   * @param value The value for basis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withBasis(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "basis");
    if (Objects.equals(this.basis, newValue)) return this;
    return new ImmutableClinicalImpression_Finding(
        this.itemReference,
        this.id,
        this.modifierExtension,
        newValue,
        this.itemCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression_Finding#basis() basis} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withBasis(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.basis, value)) return this;
    return new ImmutableClinicalImpression_Finding(
        this.itemReference,
        this.id,
        this.modifierExtension,
        value,
        this.itemCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression_Finding#itemCodeableConcept() itemCodeableConcept} attribute.
   * @param value The value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withItemCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "itemCodeableConcept");
    if (this.itemCodeableConcept == newValue) return this;
    return new ImmutableClinicalImpression_Finding(this.itemReference, this.id, this.modifierExtension, this.basis, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression_Finding#itemCodeableConcept() itemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression_Finding withItemCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.itemCodeableConcept == value) return this;
    return new ImmutableClinicalImpression_Finding(this.itemReference, this.id, this.modifierExtension, this.basis, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression_Finding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression_Finding withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClinicalImpression_Finding(
        this.itemReference,
        this.id,
        this.modifierExtension,
        this.basis,
        this.itemCodeableConcept,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression_Finding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression_Finding withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClinicalImpression_Finding(
        this.itemReference,
        this.id,
        this.modifierExtension,
        this.basis,
        this.itemCodeableConcept,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClinicalImpression_Finding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClinicalImpression_Finding
        && equalTo((ImmutableClinicalImpression_Finding) another);
  }

  private boolean equalTo(ImmutableClinicalImpression_Finding another) {
    return Objects.equals(itemReference, another.itemReference)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(basis, another.basis)
        && Objects.equals(itemCodeableConcept, another.itemCodeableConcept)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code itemReference}, {@code id}, {@code modifierExtension}, {@code basis}, {@code itemCodeableConcept}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(itemReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(basis);
    h += (h << 5) + Objects.hashCode(itemCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ClinicalImpression_Finding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClinicalImpression_Finding{");
    if (itemReference != null) {
      builder.append("itemReference=").append(itemReference);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (basis != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("basis=").append(basis);
    }
    if (itemCodeableConcept != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("itemCodeableConcept=").append(itemCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClinicalImpression_Finding", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClinicalImpression_Finding {
    @Nullable Optional<Reference> itemReference = Optional.empty();
    boolean itemReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> basis = Optional.empty();
    boolean basisIsSet;
    @Nullable Optional<CodeableConcept> itemCodeableConcept = Optional.empty();
    boolean itemCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("itemReference")
    public void setItemReference(Optional<Reference> itemReference) {
      this.itemReference = itemReference;
      this.itemReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("basis")
    public void setBasis(Optional<String> basis) {
      this.basis = basis;
      this.basisIsSet = true;
    }
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(Optional<CodeableConcept> itemCodeableConcept) {
      this.itemCodeableConcept = itemCodeableConcept;
      this.itemCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Reference> itemReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> basis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> itemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClinicalImpression_Finding fromJson(Json json) {
    ImmutableClinicalImpression_Finding.Builder builder = ImmutableClinicalImpression_Finding.builder();
    if (json.itemReferenceIsSet) {
      builder.itemReference(json.itemReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.basisIsSet) {
      builder.basis(json.basis);
    }
    if (json.itemCodeableConceptIsSet) {
      builder.itemCodeableConcept(json.itemCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableClinicalImpression_Finding) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClinicalImpression_Finding} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClinicalImpression_Finding instance
   */
  public static ClinicalImpression_Finding copyOf(ClinicalImpression_Finding instance) {
    if (instance instanceof ImmutableClinicalImpression_Finding) {
      return (ImmutableClinicalImpression_Finding) instance;
    }
    return ImmutableClinicalImpression_Finding.builder()
        .itemReference(instance.itemReference())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .basis(instance.basis())
        .itemCodeableConcept(instance.itemCodeableConcept())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ClinicalImpression_Finding ClinicalImpression_Finding}.
   * <pre>
   * ImmutableClinicalImpression_Finding.builder()
   *    .itemReference(com.medplum.types.fhir.Reference) // optional {@link ClinicalImpression_Finding#itemReference() itemReference}
   *    .id(String) // optional {@link ClinicalImpression_Finding#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClinicalImpression_Finding#modifierExtension() modifierExtension}
   *    .basis(String) // optional {@link ClinicalImpression_Finding#basis() basis}
   *    .itemCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ClinicalImpression_Finding#itemCodeableConcept() itemCodeableConcept}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClinicalImpression_Finding#extension() extension}
   *    .build();
   * </pre>
   * @return A new ClinicalImpression_Finding builder
   */
  public static ImmutableClinicalImpression_Finding.Builder builder() {
    return new ImmutableClinicalImpression_Finding.Builder();
  }

  /**
   * Builds instances of type {@link ClinicalImpression_Finding ClinicalImpression_Finding}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClinicalImpression_Finding", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ITEM_REFERENCE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_BASIS = 0x8L;
    private static final long OPT_BIT_ITEM_CODEABLE_CONCEPT = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable Reference itemReference;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String basis;
    private @Nullable CodeableConcept itemCodeableConcept;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemReference(Reference itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = Objects.requireNonNull(itemReference, "itemReference");
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemReference")
    public final Builder itemReference(Optional<? extends Reference> itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = itemReference.orElse(null);
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#id() id} to id.
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
     * Initializes the optional value {@link ClinicalImpression_Finding#id() id} to id.
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
     * Initializes the optional value {@link ClinicalImpression_Finding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClinicalImpression_Finding#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClinicalImpression_Finding#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for chained invocation
     */
    public final Builder basis(String basis) {
      checkNotIsSet(basisIsSet(), "basis");
      this.basis = Objects.requireNonNull(basis, "basis");
      optBits |= OPT_BIT_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basis")
    public final Builder basis(Optional<String> basis) {
      checkNotIsSet(basisIsSet(), "basis");
      this.basis = basis.orElse(null);
      optBits |= OPT_BIT_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemCodeableConcept(CodeableConcept itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = Objects.requireNonNull(itemCodeableConcept, "itemCodeableConcept");
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemCodeableConcept")
    public final Builder itemCodeableConcept(Optional<? extends CodeableConcept> itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = itemCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression_Finding#extension() extension} to extension.
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
     * Initializes the optional value {@link ClinicalImpression_Finding#extension() extension} to extension.
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
     * Builds a new {@link ClinicalImpression_Finding ClinicalImpression_Finding}.
     * @return An immutable instance of ClinicalImpression_Finding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClinicalImpression_Finding build() {
      return new ImmutableClinicalImpression_Finding(itemReference, id, modifierExtension, basis, itemCodeableConcept, extension);
    }

    private boolean itemReferenceIsSet() {
      return (optBits & OPT_BIT_ITEM_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean basisIsSet() {
      return (optBits & OPT_BIT_BASIS) != 0;
    }

    private boolean itemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClinicalImpression_Finding is strict, attribute is already set: ".concat(name));
    }
  }
}
