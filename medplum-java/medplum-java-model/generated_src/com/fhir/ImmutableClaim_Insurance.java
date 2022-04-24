//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Claim_Insurance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Insurance.builder()}.
 */
@org.immutables.value.Generated(from = "Claim_Insurance", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Insurance implements com.fhir.Claim_Insurance {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> preAuthRef;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.Reference coverage;
  private final @javax.annotation.Nullable com.fhir.Reference claimResponse;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.lang.String businessArrangement;
  private final @javax.annotation.Nullable java.lang.Boolean focal;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;

  private ImmutableClaim_Insurance(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<java.lang.String> preAuthRef,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.Reference coverage,
      @javax.annotation.Nullable com.fhir.Reference claimResponse,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.lang.String businessArrangement,
      @javax.annotation.Nullable java.lang.Boolean focal,
      @javax.annotation.Nullable com.fhir.Identifier identifier) {
    this.modifierExtension = modifierExtension;
    this.preAuthRef = preAuthRef;
    this.id = id;
    this.extension = extension;
    this.coverage = coverage;
    this.claimResponse = claimResponse;
    this.sequence = sequence;
    this.businessArrangement = businessArrangement;
    this.focal = focal;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code preAuthRef} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> preAuthRef() {
    return java.util.Optional.ofNullable(preAuthRef);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code coverage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("coverage")
  @Override
  public com.fhir.Reference coverage() {
    return coverage;
  }

  /**
   * @return The value of the {@code claimResponse} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("claimResponse")
  @Override
  public java.util.Optional<com.fhir.Reference> claimResponse() {
    return java.util.Optional.ofNullable(claimResponse);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code businessArrangement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("businessArrangement")
  @Override
  public java.util.Optional<java.lang.String> businessArrangement() {
    return java.util.Optional.ofNullable(businessArrangement);
  }

  /**
   * @return The value of the {@code focal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focal")
  @Override
  public java.util.Optional<java.lang.Boolean> focal() {
    return java.util.Optional.ofNullable(focal);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Insurance(
        newValue,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Insurance(
        value,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withPreAuthRef(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "preAuthRef");
    if (this.preAuthRef == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        newValue,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#preAuthRef() preAuthRef} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withPreAuthRef(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.preAuthRef == value) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        value,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        newValue,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        value,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        newValue,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        value,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_Insurance#coverage() coverage} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coverage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_Insurance withCoverage(com.fhir.Reference value) {
    if (this.coverage == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "coverage");
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        newValue,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#claimResponse() claimResponse} attribute.
   * @param value The value for claimResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withClaimResponse(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "claimResponse");
    if (this.claimResponse == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        newValue,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#claimResponse() claimResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claimResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withClaimResponse(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.claimResponse == value) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        value,
        this.sequence,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        newValue,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        value,
        this.businessArrangement,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#businessArrangement() businessArrangement} attribute.
   * @param value The value for businessArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withBusinessArrangement(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "businessArrangement");
    if (java.util.Objects.equals(this.businessArrangement, newValue)) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        newValue,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#businessArrangement() businessArrangement} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for businessArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withBusinessArrangement(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.businessArrangement, value)) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        value,
        this.focal,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#focal() focal} attribute.
   * @param value The value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withFocal(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.focal, newValue)) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#focal() focal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withFocal(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.focal, value)) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaim_Insurance(
        this.modifierExtension,
        this.preAuthRef,
        this.id,
        this.extension,
        this.coverage,
        this.claimResponse,
        this.sequence,
        this.businessArrangement,
        this.focal,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Insurance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Insurance
        && equalTo((ImmutableClaim_Insurance) another);
  }

  private boolean equalTo(ImmutableClaim_Insurance another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(preAuthRef, another.preAuthRef)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && coverage.equals(another.coverage)
        && java.util.Objects.equals(claimResponse, another.claimResponse)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(businessArrangement, another.businessArrangement)
        && java.util.Objects.equals(focal, another.focal)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code preAuthRef}, {@code id}, {@code extension}, {@code coverage}, {@code claimResponse}, {@code sequence}, {@code businessArrangement}, {@code focal}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(preAuthRef);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + coverage.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(claimResponse);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(businessArrangement);
    h += (h << 5) + java.util.Objects.hashCode(focal);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Insurance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Claim_Insurance{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (preAuthRef != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("coverage=").append(coverage);
    if (claimResponse != null) {
      builder.append(", ");
      builder.append("claimResponse=").append(claimResponse);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (businessArrangement != null) {
      builder.append(", ");
      builder.append("businessArrangement=").append(businessArrangement);
    }
    if (focal != null) {
      builder.append(", ");
      builder.append("focal=").append(focal);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Claim_Insurance", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Claim_Insurance {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> preAuthRef = java.util.Optional.empty();
    boolean preAuthRefIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.Reference coverage;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> claimResponse = java.util.Optional.empty();
    boolean claimResponseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> businessArrangement = java.util.Optional.empty();
    boolean businessArrangementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> focal = java.util.Optional.empty();
    boolean focalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public void setPreAuthRef(java.util.Optional<java.util.List<java.lang.String>> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    public void setCoverage(com.fhir.Reference coverage) {
      this.coverage = coverage;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("claimResponse")
    public void setClaimResponse(java.util.Optional<com.fhir.Reference> claimResponse) {
      this.claimResponse = claimResponse;
      this.claimResponseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("businessArrangement")
    public void setBusinessArrangement(java.util.Optional<java.lang.String> businessArrangement) {
      this.businessArrangement = businessArrangement;
      this.businessArrangementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focal")
    public void setFocal(java.util.Optional<java.lang.Boolean> focal) {
      this.focal = focal;
      this.focalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference coverage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> claimResponse() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> businessArrangement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> focal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_Insurance fromJson(Json json) {
    ImmutableClaim_Insurance.Builder builder = ((ImmutableClaim_Insurance.Builder) ImmutableClaim_Insurance.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.coverage != null) {
      builder.coverage(json.coverage);
    }
    if (json.claimResponseIsSet) {
      builder.claimResponse(json.claimResponse);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.businessArrangementIsSet) {
      builder.businessArrangement(json.businessArrangement);
    }
    if (json.focalIsSet) {
      builder.focal(json.focal);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableClaim_Insurance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_Insurance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_Insurance instance
   */
  public static Claim_Insurance copyOf(Claim_Insurance instance) {
    if (instance instanceof ImmutableClaim_Insurance) {
      return (ImmutableClaim_Insurance) instance;
    }
    return ((ImmutableClaim_Insurance.Builder) ImmutableClaim_Insurance.builder())
        .modifierExtension(instance.modifierExtension())
        .preAuthRef(instance.preAuthRef())
        .id(instance.id())
        .extension(instance.extension())
        .coverage(instance.coverage())
        .claimResponse(instance.claimResponse())
        .sequence(instance.sequence())
        .businessArrangement(instance.businessArrangement())
        .focal(instance.focal())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Insurance Claim_Insurance}.
   * <pre>
   * ImmutableClaim_Insurance.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Insurance#modifierExtension() modifierExtension}
   *    .preAuthRef(List&amp;lt;String&amp;gt;) // optional {@link Claim_Insurance#preAuthRef() preAuthRef}
   *    .id(String) // optional {@link Claim_Insurance#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Insurance#extension() extension}
   *    .coverage(com.fhir.Reference) // required {@link Claim_Insurance#coverage() coverage}
   *    .claimResponse(com.fhir.Reference) // optional {@link Claim_Insurance#claimResponse() claimResponse}
   *    .sequence(com.fhir.positiveInt) // optional {@link Claim_Insurance#sequence() sequence}
   *    .businessArrangement(String) // optional {@link Claim_Insurance#businessArrangement() businessArrangement}
   *    .focal(Boolean) // optional {@link Claim_Insurance#focal() focal}
   *    .identifier(com.fhir.Identifier) // optional {@link Claim_Insurance#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new Claim_Insurance builder
   */
  public static CoverageBuildStage builder() {
    return new ImmutableClaim_Insurance.Builder();
  }

  /**
   * Builds instances of type {@link Claim_Insurance Claim_Insurance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Claim_Insurance", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CoverageBuildStage, BuildFinal {
    private static final long INIT_BIT_COVERAGE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_CLAIM_RESPONSE = 0x10L;
    private static final long OPT_BIT_SEQUENCE = 0x20L;
    private static final long OPT_BIT_BUSINESS_ARRANGEMENT = 0x40L;
    private static final long OPT_BIT_FOCAL = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<java.lang.String> preAuthRef;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference coverage;
    private @javax.annotation.Nullable com.fhir.Reference claimResponse;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.lang.String businessArrangement;
    private @javax.annotation.Nullable java.lang.Boolean focal;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(java.util.List<java.lang.String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = java.util.Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public final Builder preAuthRef(java.util.Optional<? extends java.util.List<java.lang.String>> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the value for the {@link Claim_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    public final Builder coverage(com.fhir.Reference coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = java.util.Objects.requireNonNull(coverage, "coverage");
      initBits &= ~INIT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder claimResponse(com.fhir.Reference claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = java.util.Objects.requireNonNull(claimResponse, "claimResponse");
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimResponse")
    public final Builder claimResponse(java.util.Optional<? extends com.fhir.Reference> claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = claimResponse.orElse(null);
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for chained invocation
     */
    public final Builder businessArrangement(java.lang.String businessArrangement) {
      checkNotIsSet(businessArrangementIsSet(), "businessArrangement");
      this.businessArrangement = java.util.Objects.requireNonNull(businessArrangement, "businessArrangement");
      optBits |= OPT_BIT_BUSINESS_ARRANGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("businessArrangement")
    public final Builder businessArrangement(java.util.Optional<java.lang.String> businessArrangement) {
      checkNotIsSet(businessArrangementIsSet(), "businessArrangement");
      this.businessArrangement = businessArrangement.orElse(null);
      optBits |= OPT_BIT_BUSINESS_ARRANGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for chained invocation
     */
    public final Builder focal(boolean focal) {
      checkNotIsSet(focalIsSet(), "focal");
      this.focal = focal;
      optBits |= OPT_BIT_FOCAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focal")
    public final Builder focal(java.util.Optional<java.lang.Boolean> focal) {
      checkNotIsSet(focalIsSet(), "focal");
      this.focal = focal.orElse(null);
      optBits |= OPT_BIT_FOCAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link Claim_Insurance Claim_Insurance}.
     * @return An immutable instance of Claim_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Claim_Insurance build() {
      checkRequiredAttributes();
      return new ImmutableClaim_Insurance(
          modifierExtension,
          preAuthRef,
          id,
          extension,
          coverage,
          claimResponse,
          sequence,
          businessArrangement,
          focal,
          identifier);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean claimResponseIsSet() {
      return (optBits & OPT_BIT_CLAIM_RESPONSE) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean businessArrangementIsSet() {
      return (optBits & OPT_BIT_BUSINESS_ARRANGEMENT) != 0;
    }

    private boolean focalIsSet() {
      return (optBits & OPT_BIT_FOCAL) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean coverageIsSet() {
      return (initBits & INIT_BIT_COVERAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Claim_Insurance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!coverageIsSet()) attributes.add("coverage");
      return "Cannot build Claim_Insurance, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Claim_Insurance", generator = "Immutables")
  public interface CoverageBuildStage {
    /**
     * Initializes the value for the {@link Claim_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(com.fhir.Reference coverage);
  }

  @org.immutables.value.Generated(from = "Claim_Insurance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(java.util.List<java.lang.String> preAuthRef);

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(java.util.Optional<? extends java.util.List<java.lang.String>> preAuthRef);

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claimResponse(com.fhir.Reference claimResponse);

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claimResponse(java.util.Optional<? extends com.fhir.Reference> claimResponse);

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(com.fhir.positiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence);

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal businessArrangement(java.lang.String businessArrangement);

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal businessArrangement(java.util.Optional<java.lang.String> businessArrangement);

    /**
     * Initializes the optional value {@link Claim_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focal(boolean focal);

    /**
     * Initializes the optional value {@link Claim_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focal(java.util.Optional<java.lang.Boolean> focal);

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Builds a new {@link Claim_Insurance Claim_Insurance}.
     * @return An immutable instance of Claim_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_Insurance build();
  }
}
