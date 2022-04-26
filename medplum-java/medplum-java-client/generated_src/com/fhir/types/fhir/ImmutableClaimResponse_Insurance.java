package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ClaimResponse_Insurance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Insurance.builder()}.
 */
@Generated(from = "ClaimResponse_Insurance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Insurance implements ClaimResponse_Insurance {
  private final @Nullable Reference claimResponse;
  private final Reference coverage;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String businessArrangement;
  private final @Nullable String id;
  private final @Nullable PositiveInt sequence;
  private final @Nullable Boolean focal;

  private ImmutableClaimResponse_Insurance(
      @Nullable Reference claimResponse,
      Reference coverage,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String businessArrangement,
      @Nullable String id,
      @Nullable PositiveInt sequence,
      @Nullable Boolean focal) {
    this.claimResponse = claimResponse;
    this.coverage = coverage;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.businessArrangement = businessArrangement;
    this.id = id;
    this.sequence = sequence;
    this.focal = focal;
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
   * @return The value of the {@code coverage} attribute
   */
  @JsonProperty("coverage")
  @Override
  public Reference coverage() {
    return coverage;
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
   * @return The value of the {@code businessArrangement} attribute
   */
  @JsonProperty("businessArrangement")
  @Override
  public Optional<String> businessArrangement() {
    return Optional.ofNullable(businessArrangement);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#claimResponse() claimResponse} attribute.
   * @param value The value for claimResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withClaimResponse(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "claimResponse");
    if (this.claimResponse == newValue) return this;
    return new ImmutableClaimResponse_Insurance(
        newValue,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#claimResponse() claimResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claimResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Insurance withClaimResponse(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.claimResponse == value) return this;
    return new ImmutableClaimResponse_Insurance(
        value,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Insurance#coverage() coverage} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coverage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withCoverage(Reference value) {
    if (this.coverage == value) return this;
    Reference newValue = Objects.requireNonNull(value, "coverage");
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        newValue,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        newValue,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Insurance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        value,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        newValue,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Insurance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        value,
        this.businessArrangement,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#businessArrangement() businessArrangement} attribute.
   * @param value The value for businessArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withBusinessArrangement(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "businessArrangement");
    if (Objects.equals(this.businessArrangement, newValue)) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        newValue,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#businessArrangement() businessArrangement} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for businessArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withBusinessArrangement(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.businessArrangement, value)) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        value,
        this.id,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        newValue,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        value,
        this.sequence,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        newValue,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Insurance withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        value,
        this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Insurance#focal() focal} attribute.
   * @param value The value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withFocal(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.focal, newValue)) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Insurance#focal() focal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Insurance withFocal(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.focal, value)) return this;
    return new ImmutableClaimResponse_Insurance(
        this.claimResponse,
        this.coverage,
        this.extension,
        this.modifierExtension,
        this.businessArrangement,
        this.id,
        this.sequence,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Insurance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Insurance
        && equalTo((ImmutableClaimResponse_Insurance) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Insurance another) {
    return Objects.equals(claimResponse, another.claimResponse)
        && coverage.equals(another.coverage)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(businessArrangement, another.businessArrangement)
        && Objects.equals(id, another.id)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(focal, another.focal);
  }

  /**
   * Computes a hash code from attributes: {@code claimResponse}, {@code coverage}, {@code extension}, {@code modifierExtension}, {@code businessArrangement}, {@code id}, {@code sequence}, {@code focal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(claimResponse);
    h += (h << 5) + coverage.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(businessArrangement);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(focal);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Insurance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_Insurance{");
    if (claimResponse != null) {
      builder.append("claimResponse=").append(claimResponse);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("coverage=").append(coverage);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (businessArrangement != null) {
      builder.append(", ");
      builder.append("businessArrangement=").append(businessArrangement);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (focal != null) {
      builder.append(", ");
      builder.append("focal=").append(focal);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_Insurance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_Insurance {
    @Nullable Optional<Reference> claimResponse = Optional.empty();
    boolean claimResponseIsSet;
    @Nullable Reference coverage;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> businessArrangement = Optional.empty();
    boolean businessArrangementIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<Boolean> focal = Optional.empty();
    boolean focalIsSet;
    @JsonProperty("claimResponse")
    public void setClaimResponse(Optional<Reference> claimResponse) {
      this.claimResponse = claimResponse;
      this.claimResponseIsSet = true;
    }
    @JsonProperty("coverage")
    public void setCoverage(Reference coverage) {
      this.coverage = coverage;
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
    @JsonProperty("businessArrangement")
    public void setBusinessArrangement(Optional<String> businessArrangement) {
      this.businessArrangement = businessArrangement;
      this.businessArrangementIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @Override
    public Optional<Reference> claimResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Reference coverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> businessArrangement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> focal() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Insurance fromJson(Json json) {
    ImmutableClaimResponse_Insurance.Builder builder = ((ImmutableClaimResponse_Insurance.Builder) ImmutableClaimResponse_Insurance.builder());
    if (json.claimResponseIsSet) {
      builder.claimResponse(json.claimResponse);
    }
    if (json.coverage != null) {
      builder.coverage(json.coverage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.businessArrangementIsSet) {
      builder.businessArrangement(json.businessArrangement);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.focalIsSet) {
      builder.focal(json.focal);
    }
    return (ImmutableClaimResponse_Insurance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Insurance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Insurance instance
   */
  public static ClaimResponse_Insurance copyOf(ClaimResponse_Insurance instance) {
    if (instance instanceof ImmutableClaimResponse_Insurance) {
      return (ImmutableClaimResponse_Insurance) instance;
    }
    return ((ImmutableClaimResponse_Insurance.Builder) ImmutableClaimResponse_Insurance.builder())
        .claimResponse(instance.claimResponse())
        .coverage(instance.coverage())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .businessArrangement(instance.businessArrangement())
        .id(instance.id())
        .sequence(instance.sequence())
        .focal(instance.focal())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Insurance ClaimResponse_Insurance}.
   * <pre>
   * ImmutableClaimResponse_Insurance.builder()
   *    .claimResponse(com.fhir.types.fhir.Reference) // optional {@link ClaimResponse_Insurance#claimResponse() claimResponse}
   *    .coverage(com.fhir.types.fhir.Reference) // required {@link ClaimResponse_Insurance#coverage() coverage}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Insurance#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Insurance#modifierExtension() modifierExtension}
   *    .businessArrangement(String) // optional {@link ClaimResponse_Insurance#businessArrangement() businessArrangement}
   *    .id(String) // optional {@link ClaimResponse_Insurance#id() id}
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link ClaimResponse_Insurance#sequence() sequence}
   *    .focal(Boolean) // optional {@link ClaimResponse_Insurance#focal() focal}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Insurance builder
   */
  public static CoverageBuildStage builder() {
    return new ImmutableClaimResponse_Insurance.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Insurance ClaimResponse_Insurance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_Insurance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CoverageBuildStage, BuildFinal {
    private static final long INIT_BIT_COVERAGE = 0x1L;
    private static final long OPT_BIT_CLAIM_RESPONSE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_BUSINESS_ARRANGEMENT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_SEQUENCE = 0x20L;
    private static final long OPT_BIT_FOCAL = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference claimResponse;
    private @Nullable Reference coverage;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String businessArrangement;
    private @Nullable String id;
    private @Nullable PositiveInt sequence;
    private @Nullable Boolean focal;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#claimResponse() claimResponse} to claimResponse.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#claimResponse() claimResponse} to claimResponse.
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
     * Initializes the value for the {@link ClaimResponse_Insurance#coverage() coverage} attribute.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#businessArrangement() businessArrangement} to businessArrangement.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#businessArrangement() businessArrangement} to businessArrangement.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#focal() focal} to focal.
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
     * Initializes the optional value {@link ClaimResponse_Insurance#focal() focal} to focal.
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
     * Builds a new {@link ClaimResponse_Insurance ClaimResponse_Insurance}.
     * @return An immutable instance of ClaimResponse_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_Insurance build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Insurance(
          claimResponse,
          coverage,
          extension,
          modifierExtension,
          businessArrangement,
          id,
          sequence,
          focal);
    }

    private boolean claimResponseIsSet() {
      return (optBits & OPT_BIT_CLAIM_RESPONSE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean businessArrangementIsSet() {
      return (optBits & OPT_BIT_BUSINESS_ARRANGEMENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean focalIsSet() {
      return (optBits & OPT_BIT_FOCAL) != 0;
    }

    private boolean coverageIsSet() {
      return (initBits & INIT_BIT_COVERAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_Insurance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!coverageIsSet()) attributes.add("coverage");
      return "Cannot build ClaimResponse_Insurance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse_Insurance", generator = "Immutables")
  public interface CoverageBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Reference coverage);
  }

  @Generated(from = "ClaimResponse_Insurance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claimResponse(Reference claimResponse);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claimResponse(Optional<? extends Reference> claimResponse);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal businessArrangement(String businessArrangement);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#businessArrangement() businessArrangement} to businessArrangement.
     * @param businessArrangement The value for businessArrangement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal businessArrangement(Optional<String> businessArrangement);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focal(boolean focal);

    /**
     * Initializes the optional value {@link ClaimResponse_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focal(Optional<Boolean> focal);

    /**
     * Builds a new {@link ClaimResponse_Insurance ClaimResponse_Insurance}.
     * @return An immutable instance of ClaimResponse_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Insurance build();
  }
}
