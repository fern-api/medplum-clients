package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Claim_Insurance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Insurance.builder()}.
 */
@Generated(from = "Claim_Insurance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Insurance implements Claim_Insurance {
  private final @Nullable String businessArrangement;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable PositiveInt sequence;
  private final @Nullable Boolean focal;
  private final @Nullable List<Extension> extension;
  private final Reference coverage;
  private final @Nullable List<String> preAuthRef;
  private final @Nullable Reference claimResponse;
  private final @Nullable Identifier identifier;
  private final @Nullable String id;

  private ImmutableClaim_Insurance(
      @Nullable String businessArrangement,
      @Nullable List<Extension> modifierExtension,
      @Nullable PositiveInt sequence,
      @Nullable Boolean focal,
      @Nullable List<Extension> extension,
      Reference coverage,
      @Nullable List<String> preAuthRef,
      @Nullable Reference claimResponse,
      @Nullable Identifier identifier,
      @Nullable String id) {
    this.businessArrangement = businessArrangement;
    this.modifierExtension = modifierExtension;
    this.sequence = sequence;
    this.focal = focal;
    this.extension = extension;
    this.coverage = coverage;
    this.preAuthRef = preAuthRef;
    this.claimResponse = claimResponse;
    this.identifier = identifier;
    this.id = id;
  }

  /**
   * @return The value of the {@code businessArrangement} attribute
   */
  @JsonProperty("businessArrangement")
  @Override
  public Optional<String> businessArrangement() {
    return Optional.ofNullable(businessArrangement);
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
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code focal} attribute
   */
  @JsonProperty("focal")
  @Override
  public Optional<Boolean> focal() {
    return Optional.ofNullable(focal);
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
   * @return The value of the {@code coverage} attribute
   */
  @JsonProperty("coverage")
  @Override
  public Reference coverage() {
    return coverage;
  }

  /**
   * @return The value of the {@code preAuthRef} attribute
   */
  @JsonProperty("preAuthRef")
  @Override
  public Optional<List<String>> preAuthRef() {
    return Optional.ofNullable(preAuthRef);
  }

  /**
   * @return The value of the {@code claimResponse} attribute
   */
  @JsonProperty("claimResponse")
  @Override
  public Optional<Reference> claimResponse() {
    return Optional.ofNullable(claimResponse);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#businessArrangement() businessArrangement} attribute.
   * @param value The value for businessArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withBusinessArrangement(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "businessArrangement");
    if (Objects.equals(this.businessArrangement, newValue)) return this;
    return new ImmutableClaim_Insurance(
        newValue,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#businessArrangement() businessArrangement} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for businessArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withBusinessArrangement(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.businessArrangement, value)) return this;
    return new ImmutableClaim_Insurance(
        value,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        newValue,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        value,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        newValue,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        value,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#focal() focal} attribute.
   * @param value The value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withFocal(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.focal, newValue)) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        newValue,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#focal() focal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withFocal(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.focal, value)) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        value,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        newValue,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        value,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_Insurance#coverage() coverage} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coverage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_Insurance withCoverage(Reference value) {
    if (this.coverage == value) return this;
    Reference newValue = Objects.requireNonNull(value, "coverage");
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        newValue,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withPreAuthRef(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "preAuthRef");
    if (this.preAuthRef == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        newValue,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#preAuthRef() preAuthRef} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withPreAuthRef(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.preAuthRef == value) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        value,
        this.claimResponse,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#claimResponse() claimResponse} attribute.
   * @param value The value for claimResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withClaimResponse(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "claimResponse");
    if (this.claimResponse == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        newValue,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#claimResponse() claimResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claimResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withClaimResponse(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.claimResponse == value) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        value,
        this.identifier,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Insurance withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Insurance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Insurance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Insurance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Insurance(
        this.businessArrangement,
        this.modifierExtension,
        this.sequence,
        this.focal,
        this.extension,
        this.coverage,
        this.preAuthRef,
        this.claimResponse,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Insurance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Insurance
        && equalTo((ImmutableClaim_Insurance) another);
  }

  private boolean equalTo(ImmutableClaim_Insurance another) {
    return Objects.equals(businessArrangement, another.businessArrangement)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(focal, another.focal)
        && Objects.equals(extension, another.extension)
        && coverage.equals(another.coverage)
        && Objects.equals(preAuthRef, another.preAuthRef)
        && Objects.equals(claimResponse, another.claimResponse)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code businessArrangement}, {@code modifierExtension}, {@code sequence}, {@code focal}, {@code extension}, {@code coverage}, {@code preAuthRef}, {@code claimResponse}, {@code identifier}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(businessArrangement);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(focal);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + coverage.hashCode();
    h += (h << 5) + Objects.hashCode(preAuthRef);
    h += (h << 5) + Objects.hashCode(claimResponse);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Insurance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_Insurance{");
    if (businessArrangement != null) {
      builder.append("businessArrangement=").append(businessArrangement);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (sequence != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (focal != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("focal=").append(focal);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("coverage=").append(coverage);
    if (preAuthRef != null) {
      builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (claimResponse != null) {
      builder.append(", ");
      builder.append("claimResponse=").append(claimResponse);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
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
  @Generated(from = "Claim_Insurance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_Insurance {
    @Nullable Optional<String> businessArrangement = Optional.empty();
    boolean businessArrangementIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<Boolean> focal = Optional.empty();
    boolean focalIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference coverage;
    @Nullable Optional<List<String>> preAuthRef = Optional.empty();
    boolean preAuthRefIsSet;
    @Nullable Optional<Reference> claimResponse = Optional.empty();
    boolean claimResponseIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("businessArrangement")
    public void setBusinessArrangement(Optional<String> businessArrangement) {
      this.businessArrangement = businessArrangement;
      this.businessArrangementIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("focal")
    public void setFocal(Optional<Boolean> focal) {
      this.focal = focal;
      this.focalIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("coverage")
    public void setCoverage(Reference coverage) {
      this.coverage = coverage;
    }
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(Optional<List<String>> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @JsonProperty("claimResponse")
    public void setClaimResponse(Optional<Reference> claimResponse) {
      this.claimResponse = claimResponse;
      this.claimResponseIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<String> businessArrangement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> focal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference coverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> claimResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
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
  static ImmutableClaim_Insurance fromJson(Json json) {
    ImmutableClaim_Insurance.Builder builder = ((ImmutableClaim_Insurance.Builder) ImmutableClaim_Insurance.builder());
    if (json.businessArrangementIsSet) {
      builder.businessArrangement(json.businessArrangement);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.focalIsSet) {
      builder.focal(json.focal);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.coverage != null) {
      builder.coverage(json.coverage);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.claimResponseIsSet) {
      builder.claimResponse(json.claimResponse);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .businessArrangement(instance.businessArrangement())
        .modifierExtension(instance.modifierExtension())
        .sequence(instance.sequence())
        .focal(instance.focal())
        .extension(instance.extension())
        .coverage(instance.coverage())
        .preAuthRef(instance.preAuthRef())
        .claimResponse(instance.claimResponse())
        .identifier(instance.identifier())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Insurance Claim_Insurance}.
   * <pre>
   * ImmutableClaim_Insurance.builder()
   *    .businessArrangement(String) // optional {@link Claim_Insurance#businessArrangement() businessArrangement}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Claim_Insurance#modifierExtension() modifierExtension}
   *    .sequence(com.medplum.types.fhir.PositiveInt) // optional {@link Claim_Insurance#sequence() sequence}
   *    .focal(Boolean) // optional {@link Claim_Insurance#focal() focal}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Claim_Insurance#extension() extension}
   *    .coverage(com.medplum.types.fhir.Reference) // required {@link Claim_Insurance#coverage() coverage}
   *    .preAuthRef(List&amp;lt;String&amp;gt;) // optional {@link Claim_Insurance#preAuthRef() preAuthRef}
   *    .claimResponse(com.medplum.types.fhir.Reference) // optional {@link Claim_Insurance#claimResponse() claimResponse}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link Claim_Insurance#identifier() identifier}
   *    .id(String) // optional {@link Claim_Insurance#id() id}
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
  @Generated(from = "Claim_Insurance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CoverageBuildStage, BuildFinal {
    private static final long INIT_BIT_COVERAGE = 0x1L;
    private static final long OPT_BIT_BUSINESS_ARRANGEMENT = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_SEQUENCE = 0x4L;
    private static final long OPT_BIT_FOCAL = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x20L;
    private static final long OPT_BIT_CLAIM_RESPONSE = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String businessArrangement;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable PositiveInt sequence;
    private @Nullable Boolean focal;
    private @Nullable List<Extension> extension;
    private @Nullable Reference coverage;
    private @Nullable List<String> preAuthRef;
    private @Nullable Reference claimResponse;
    private @Nullable Identifier identifier;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for chained invocation
     */
    public final Builder businessArrangement(String businessArrangement) {
      checkNotIsSet(businessArrangementIsSet(), "businessArrangement");
      this.businessArrangement = Objects.requireNonNull(businessArrangement, "businessArrangement");
      optBits |= OPT_BIT_BUSINESS_ARRANGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("businessArrangement")
    public final Builder businessArrangement(Optional<String> businessArrangement) {
      checkNotIsSet(businessArrangementIsSet(), "businessArrangement");
      this.businessArrangement = businessArrangement.orElse(null);
      optBits |= OPT_BIT_BUSINESS_ARRANGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
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
    @JsonProperty("focal")
    public final Builder focal(Optional<Boolean> focal) {
      checkNotIsSet(focalIsSet(), "focal");
      this.focal = focal.orElse(null);
      optBits |= OPT_BIT_FOCAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
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
     * Initializes the value for the {@link Claim_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverage")
    public final Builder coverage(Reference coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = Objects.requireNonNull(coverage, "coverage");
      initBits &= ~INIT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(List<String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAuthRef")
    public final Builder preAuthRef(Optional<? extends List<String>> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder claimResponse(Reference claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = Objects.requireNonNull(claimResponse, "claimResponse");
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("claimResponse")
    public final Builder claimResponse(Optional<? extends Reference> claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = claimResponse.orElse(null);
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
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
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
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
     * Builds a new {@link Claim_Insurance Claim_Insurance}.
     * @return An immutable instance of Claim_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_Insurance build() {
      checkRequiredAttributes();
      return new ImmutableClaim_Insurance(
          businessArrangement,
          modifierExtension,
          sequence,
          focal,
          extension,
          coverage,
          preAuthRef,
          claimResponse,
          identifier,
          id);
    }

    private boolean businessArrangementIsSet() {
      return (optBits & OPT_BIT_BUSINESS_ARRANGEMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean focalIsSet() {
      return (optBits & OPT_BIT_FOCAL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean claimResponseIsSet() {
      return (optBits & OPT_BIT_CLAIM_RESPONSE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean coverageIsSet() {
      return (initBits & INIT_BIT_COVERAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_Insurance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!coverageIsSet()) attributes.add("coverage");
      return "Cannot build Claim_Insurance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Claim_Insurance", generator = "Immutables")
  public interface CoverageBuildStage {
    /**
     * Initializes the value for the {@link Claim_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Reference coverage);
  }

  @Generated(from = "Claim_Insurance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal businessArrangement(String businessArrangement);

    /**
     * Initializes the optional value {@link Claim_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal businessArrangement(Optional<String> businessArrangement);

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

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
    BuildFinal focal(Optional<Boolean> focal);

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Claim_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(List<String> preAuthRef);

    /**
     * Initializes the optional value {@link Claim_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(Optional<? extends List<String>> preAuthRef);

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claimResponse(Reference claimResponse);

    /**
     * Initializes the optional value {@link Claim_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claimResponse(Optional<? extends Reference> claimResponse);

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link Claim_Insurance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Claim_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Claim_Insurance Claim_Insurance}.
     * @return An immutable instance of Claim_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_Insurance build();
  }
}
