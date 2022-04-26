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
 * Immutable implementation of {@link Claim_Related}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Related.builder()}.
 */
@Generated(from = "Claim_Related", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Related implements Claim_Related {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept relationship;
  private final @Nullable Identifier reference;
  private final @Nullable String id;
  private final @Nullable Reference claim;

  private ImmutableClaim_Related(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept relationship,
      @Nullable Identifier reference,
      @Nullable String id,
      @Nullable Reference claim) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.relationship = relationship;
    this.reference = reference;
    this.id = id;
    this.claim = claim;
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
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<CodeableConcept> relationship() {
    return Optional.ofNullable(relationship);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Optional<Identifier> reference() {
    return Optional.ofNullable(reference);
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
   * @return The value of the {@code claim} attribute
   */
  @JsonProperty("claim")
  @Override
  public Optional<Reference> claim() {
    return Optional.ofNullable(claim);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Related#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Related(newValue, this.modifierExtension, this.relationship, this.reference, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Related#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Related withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Related(value, this.modifierExtension, this.relationship, this.reference, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Related#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Related(this.extension, newValue, this.relationship, this.reference, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Related#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Related withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Related(this.extension, value, this.relationship, this.reference, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Related#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withRelationship(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, newValue, this.reference, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Related#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Related withRelationship(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, value, this.reference, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Related#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withReference(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, this.relationship, newValue, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Related#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Related withReference(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, this.relationship, value, this.id, this.claim);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Related#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, this.relationship, this.reference, newValue, this.claim);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Related#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, this.relationship, this.reference, value, this.claim);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Related#claim() claim} attribute.
   * @param value The value for claim
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Related withClaim(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "claim");
    if (this.claim == newValue) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, this.relationship, this.reference, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Related#claim() claim} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claim
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Related withClaim(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.claim == value) return this;
    return new ImmutableClaim_Related(this.extension, this.modifierExtension, this.relationship, this.reference, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Related} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Related
        && equalTo((ImmutableClaim_Related) another);
  }

  private boolean equalTo(ImmutableClaim_Related another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(reference, another.reference)
        && Objects.equals(id, another.id)
        && Objects.equals(claim, another.claim);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code relationship}, {@code reference}, {@code id}, {@code claim}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(reference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(claim);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Related} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_Related{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (relationship != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (reference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reference=").append(reference);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (claim != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("claim=").append(claim);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim_Related", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_Related {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<Identifier> reference = Optional.empty();
    boolean referenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> claim = Optional.empty();
    boolean claimIsSet;
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
    @JsonProperty("relationship")
    public void setRelationship(Optional<CodeableConcept> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Optional<Identifier> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("claim")
    public void setClaim(Optional<Reference> claim) {
      this.claim = claim;
      this.claimIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> claim() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_Related fromJson(Json json) {
    ImmutableClaim_Related.Builder builder = ImmutableClaim_Related.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.claimIsSet) {
      builder.claim(json.claim);
    }
    return (ImmutableClaim_Related) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_Related} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_Related instance
   */
  public static Claim_Related copyOf(Claim_Related instance) {
    if (instance instanceof ImmutableClaim_Related) {
      return (ImmutableClaim_Related) instance;
    }
    return ImmutableClaim_Related.builder()
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .relationship(instance.relationship())
        .reference(instance.reference())
        .id(instance.id())
        .claim(instance.claim())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Related Claim_Related}.
   * <pre>
   * ImmutableClaim_Related.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_Related#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_Related#modifierExtension() modifierExtension}
   *    .relationship(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_Related#relationship() relationship}
   *    .reference(com.fhir.types.fhir.Identifier) // optional {@link Claim_Related#reference() reference}
   *    .id(String) // optional {@link Claim_Related#id() id}
   *    .claim(com.fhir.types.fhir.Reference) // optional {@link Claim_Related#claim() claim}
   *    .build();
   * </pre>
   * @return A new Claim_Related builder
   */
  public static ImmutableClaim_Related.Builder builder() {
    return new ImmutableClaim_Related.Builder();
  }

  /**
   * Builds instances of type {@link Claim_Related Claim_Related}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim_Related", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_RELATIONSHIP = 0x4L;
    private static final long OPT_BIT_REFERENCE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_CLAIM = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept relationship;
    private @Nullable Identifier reference;
    private @Nullable String id;
    private @Nullable Reference claim;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_Related#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Related#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Related#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Related#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Related#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(CodeableConcept relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Related#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends CodeableConcept> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Related#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(Identifier reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Related#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Optional<? extends Identifier> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Related#id() id} to id.
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
     * Initializes the optional value {@link Claim_Related#id() id} to id.
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
     * Initializes the optional value {@link Claim_Related#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for chained invocation
     */
    public final Builder claim(Reference claim) {
      checkNotIsSet(claimIsSet(), "claim");
      this.claim = Objects.requireNonNull(claim, "claim");
      optBits |= OPT_BIT_CLAIM;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Related#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("claim")
    public final Builder claim(Optional<? extends Reference> claim) {
      checkNotIsSet(claimIsSet(), "claim");
      this.claim = claim.orElse(null);
      optBits |= OPT_BIT_CLAIM;
      return this;
    }

    /**
     * Builds a new {@link Claim_Related Claim_Related}.
     * @return An immutable instance of Claim_Related
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_Related build() {
      return new ImmutableClaim_Related(extension, modifierExtension, relationship, reference, id, claim);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean claimIsSet() {
      return (optBits & OPT_BIT_CLAIM) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_Related is strict, attribute is already set: ".concat(name));
    }
  }
}
