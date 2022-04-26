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
 * Immutable implementation of {@link SpecimenDefinition_Additive}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimenDefinition_Additive.builder()}.
 */
@Generated(from = "SpecimenDefinition_Additive", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimenDefinition_Additive
    implements SpecimenDefinition_Additive {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept additiveCodeableConcept;
  private final @Nullable Reference additiveReference;

  private ImmutableSpecimenDefinition_Additive(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept additiveCodeableConcept,
      @Nullable Reference additiveReference) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.additiveCodeableConcept = additiveCodeableConcept;
    this.additiveReference = additiveReference;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code additiveCodeableConcept} attribute
   */
  @JsonProperty("additiveCodeableConcept")
  @Override
  public Optional<CodeableConcept> additiveCodeableConcept() {
    return Optional.ofNullable(additiveCodeableConcept);
  }

  /**
   * @return The value of the {@code additiveReference} attribute
   */
  @JsonProperty("additiveReference")
  @Override
  public Optional<Reference> additiveReference() {
    return Optional.ofNullable(additiveReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Additive#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Additive withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimenDefinition_Additive(newValue, this.id, this.extension, this.additiveCodeableConcept, this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Additive#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Additive withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimenDefinition_Additive(value, this.id, this.extension, this.additiveCodeableConcept, this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Additive#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Additive withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimenDefinition_Additive(
        this.modifierExtension,
        newValue,
        this.extension,
        this.additiveCodeableConcept,
        this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Additive#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Additive withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimenDefinition_Additive(
        this.modifierExtension,
        value,
        this.extension,
        this.additiveCodeableConcept,
        this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Additive#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Additive withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimenDefinition_Additive(this.modifierExtension, this.id, newValue, this.additiveCodeableConcept, this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Additive#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Additive withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimenDefinition_Additive(this.modifierExtension, this.id, value, this.additiveCodeableConcept, this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Additive#additiveCodeableConcept() additiveCodeableConcept} attribute.
   * @param value The value for additiveCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Additive withAdditiveCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "additiveCodeableConcept");
    if (this.additiveCodeableConcept == newValue) return this;
    return new ImmutableSpecimenDefinition_Additive(this.modifierExtension, this.id, this.extension, newValue, this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Additive#additiveCodeableConcept() additiveCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additiveCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Additive withAdditiveCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.additiveCodeableConcept == value) return this;
    return new ImmutableSpecimenDefinition_Additive(this.modifierExtension, this.id, this.extension, value, this.additiveReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Additive#additiveReference() additiveReference} attribute.
   * @param value The value for additiveReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Additive withAdditiveReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "additiveReference");
    if (this.additiveReference == newValue) return this;
    return new ImmutableSpecimenDefinition_Additive(this.modifierExtension, this.id, this.extension, this.additiveCodeableConcept, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Additive#additiveReference() additiveReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additiveReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Additive withAdditiveReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.additiveReference == value) return this;
    return new ImmutableSpecimenDefinition_Additive(this.modifierExtension, this.id, this.extension, this.additiveCodeableConcept, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimenDefinition_Additive} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimenDefinition_Additive
        && equalTo((ImmutableSpecimenDefinition_Additive) another);
  }

  private boolean equalTo(ImmutableSpecimenDefinition_Additive another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(additiveCodeableConcept, another.additiveCodeableConcept)
        && Objects.equals(additiveReference, another.additiveReference);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code extension}, {@code additiveCodeableConcept}, {@code additiveReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(additiveCodeableConcept);
    h += (h << 5) + Objects.hashCode(additiveReference);
    return h;
  }

  /**
   * Prints the immutable value {@code SpecimenDefinition_Additive} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SpecimenDefinition_Additive{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (additiveCodeableConcept != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("additiveCodeableConcept=").append(additiveCodeableConcept);
    }
    if (additiveReference != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("additiveReference=").append(additiveReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SpecimenDefinition_Additive", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SpecimenDefinition_Additive {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> additiveCodeableConcept = Optional.empty();
    boolean additiveCodeableConceptIsSet;
    @Nullable Optional<Reference> additiveReference = Optional.empty();
    boolean additiveReferenceIsSet;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("additiveCodeableConcept")
    public void setAdditiveCodeableConcept(Optional<CodeableConcept> additiveCodeableConcept) {
      this.additiveCodeableConcept = additiveCodeableConcept;
      this.additiveCodeableConceptIsSet = true;
    }
    @JsonProperty("additiveReference")
    public void setAdditiveReference(Optional<Reference> additiveReference) {
      this.additiveReference = additiveReference;
      this.additiveReferenceIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> additiveCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> additiveReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimenDefinition_Additive fromJson(Json json) {
    ImmutableSpecimenDefinition_Additive.Builder builder = ImmutableSpecimenDefinition_Additive.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.additiveCodeableConceptIsSet) {
      builder.additiveCodeableConcept(json.additiveCodeableConcept);
    }
    if (json.additiveReferenceIsSet) {
      builder.additiveReference(json.additiveReference);
    }
    return (ImmutableSpecimenDefinition_Additive) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SpecimenDefinition_Additive} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecimenDefinition_Additive instance
   */
  public static SpecimenDefinition_Additive copyOf(SpecimenDefinition_Additive instance) {
    if (instance instanceof ImmutableSpecimenDefinition_Additive) {
      return (ImmutableSpecimenDefinition_Additive) instance;
    }
    return ImmutableSpecimenDefinition_Additive.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .additiveCodeableConcept(instance.additiveCodeableConcept())
        .additiveReference(instance.additiveReference())
        .build();
  }

  /**
   * Creates a builder for {@link SpecimenDefinition_Additive SpecimenDefinition_Additive}.
   * <pre>
   * ImmutableSpecimenDefinition_Additive.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_Additive#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link SpecimenDefinition_Additive#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_Additive#extension() extension}
   *    .additiveCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link SpecimenDefinition_Additive#additiveCodeableConcept() additiveCodeableConcept}
   *    .additiveReference(com.medplum.types.fhir.Reference) // optional {@link SpecimenDefinition_Additive#additiveReference() additiveReference}
   *    .build();
   * </pre>
   * @return A new SpecimenDefinition_Additive builder
   */
  public static ImmutableSpecimenDefinition_Additive.Builder builder() {
    return new ImmutableSpecimenDefinition_Additive.Builder();
  }

  /**
   * Builds instances of type {@link SpecimenDefinition_Additive SpecimenDefinition_Additive}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SpecimenDefinition_Additive", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ADDITIVE_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_ADDITIVE_REFERENCE = 0x10L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept additiveCodeableConcept;
    private @Nullable Reference additiveReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Additive#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_Additive#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_Additive#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_Additive#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_Additive#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_Additive#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_Additive#additiveCodeableConcept() additiveCodeableConcept} to additiveCodeableConcept.
     * @param additiveCodeableConcept The value for additiveCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder additiveCodeableConcept(CodeableConcept additiveCodeableConcept) {
      checkNotIsSet(additiveCodeableConceptIsSet(), "additiveCodeableConcept");
      this.additiveCodeableConcept = Objects.requireNonNull(additiveCodeableConcept, "additiveCodeableConcept");
      optBits |= OPT_BIT_ADDITIVE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Additive#additiveCodeableConcept() additiveCodeableConcept} to additiveCodeableConcept.
     * @param additiveCodeableConcept The value for additiveCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additiveCodeableConcept")
    public final Builder additiveCodeableConcept(Optional<? extends CodeableConcept> additiveCodeableConcept) {
      checkNotIsSet(additiveCodeableConceptIsSet(), "additiveCodeableConcept");
      this.additiveCodeableConcept = additiveCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ADDITIVE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Additive#additiveReference() additiveReference} to additiveReference.
     * @param additiveReference The value for additiveReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder additiveReference(Reference additiveReference) {
      checkNotIsSet(additiveReferenceIsSet(), "additiveReference");
      this.additiveReference = Objects.requireNonNull(additiveReference, "additiveReference");
      optBits |= OPT_BIT_ADDITIVE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Additive#additiveReference() additiveReference} to additiveReference.
     * @param additiveReference The value for additiveReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additiveReference")
    public final Builder additiveReference(Optional<? extends Reference> additiveReference) {
      checkNotIsSet(additiveReferenceIsSet(), "additiveReference");
      this.additiveReference = additiveReference.orElse(null);
      optBits |= OPT_BIT_ADDITIVE_REFERENCE;
      return this;
    }

    /**
     * Builds a new {@link SpecimenDefinition_Additive SpecimenDefinition_Additive}.
     * @return An immutable instance of SpecimenDefinition_Additive
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SpecimenDefinition_Additive build() {
      return new ImmutableSpecimenDefinition_Additive(modifierExtension, id, extension, additiveCodeableConcept, additiveReference);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean additiveCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_CODEABLE_CONCEPT) != 0;
    }

    private boolean additiveReferenceIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SpecimenDefinition_Additive is strict, attribute is already set: ".concat(name));
    }
  }
}
