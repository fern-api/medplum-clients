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
 * Immutable implementation of {@link ExplanationOfBenefit_Insurance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Insurance.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Insurance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Insurance
    implements ExplanationOfBenefit_Insurance {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<String> preAuthRef;
  private final Reference coverage;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Boolean focal;

  private ImmutableExplanationOfBenefit_Insurance(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<String> preAuthRef,
      Reference coverage,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Boolean focal) {
    this.modifierExtension = modifierExtension;
    this.preAuthRef = preAuthRef;
    this.coverage = coverage;
    this.extension = extension;
    this.id = id;
    this.focal = focal;
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
   * @return The value of the {@code preAuthRef} attribute
   */
  @JsonProperty("preAuthRef")
  @Override
  public Optional<List<String>> preAuthRef() {
    return Optional.ofNullable(preAuthRef);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Insurance(newValue, this.preAuthRef, this.coverage, this.extension, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Insurance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Insurance(value, this.preAuthRef, this.coverage, this.extension, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withPreAuthRef(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "preAuthRef");
    if (this.preAuthRef == newValue) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, newValue, this.coverage, this.extension, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Insurance withPreAuthRef(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.preAuthRef == value) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, value, this.coverage, this.extension, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_Insurance#coverage() coverage} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coverage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withCoverage(Reference value) {
    if (this.coverage == value) return this;
    Reference newValue = Objects.requireNonNull(value, "coverage");
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, newValue, this.extension, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Insurance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, this.coverage, newValue, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Insurance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Insurance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, this.coverage, value, this.id, this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Insurance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, this.coverage, this.extension, newValue, this.focal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Insurance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, this.coverage, this.extension, value, this.focal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Insurance#focal() focal} attribute.
   * @param value The value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withFocal(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.focal, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, this.coverage, this.extension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Insurance#focal() focal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Insurance withFocal(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.focal, value)) return this;
    return new ImmutableExplanationOfBenefit_Insurance(this.modifierExtension, this.preAuthRef, this.coverage, this.extension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Insurance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Insurance
        && equalTo((ImmutableExplanationOfBenefit_Insurance) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Insurance another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(preAuthRef, another.preAuthRef)
        && coverage.equals(another.coverage)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(focal, another.focal);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code preAuthRef}, {@code coverage}, {@code extension}, {@code id}, {@code focal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(preAuthRef);
    h += (h << 5) + coverage.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(focal);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Insurance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Insurance{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (preAuthRef != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("coverage=").append(coverage);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  @Generated(from = "ExplanationOfBenefit_Insurance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Insurance {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<String>> preAuthRef = Optional.empty();
    boolean preAuthRefIsSet;
    @Nullable Reference coverage;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> focal = Optional.empty();
    boolean focalIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(Optional<List<String>> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("focal")
    public void setFocal(Optional<Boolean> focal) {
      this.focal = focal;
      this.focalIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public Reference coverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableExplanationOfBenefit_Insurance fromJson(Json json) {
    ImmutableExplanationOfBenefit_Insurance.Builder builder = ((ImmutableExplanationOfBenefit_Insurance.Builder) ImmutableExplanationOfBenefit_Insurance.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.coverage != null) {
      builder.coverage(json.coverage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.focalIsSet) {
      builder.focal(json.focal);
    }
    return (ImmutableExplanationOfBenefit_Insurance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Insurance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Insurance instance
   */
  public static ExplanationOfBenefit_Insurance copyOf(ExplanationOfBenefit_Insurance instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Insurance) {
      return (ImmutableExplanationOfBenefit_Insurance) instance;
    }
    return ((ImmutableExplanationOfBenefit_Insurance.Builder) ImmutableExplanationOfBenefit_Insurance.builder())
        .modifierExtension(instance.modifierExtension())
        .preAuthRef(instance.preAuthRef())
        .coverage(instance.coverage())
        .extension(instance.extension())
        .id(instance.id())
        .focal(instance.focal())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Insurance ExplanationOfBenefit_Insurance}.
   * <pre>
   * ImmutableExplanationOfBenefit_Insurance.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension}
   *    .preAuthRef(List&amp;lt;String&amp;gt;) // optional {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef}
   *    .coverage(com.fhir.types.fhir.Reference) // required {@link ExplanationOfBenefit_Insurance#coverage() coverage}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Insurance#extension() extension}
   *    .id(String) // optional {@link ExplanationOfBenefit_Insurance#id() id}
   *    .focal(Boolean) // optional {@link ExplanationOfBenefit_Insurance#focal() focal}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Insurance builder
   */
  public static CoverageBuildStage builder() {
    return new ImmutableExplanationOfBenefit_Insurance.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Insurance ExplanationOfBenefit_Insurance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Insurance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CoverageBuildStage, BuildFinal {
    private static final long INIT_BIT_COVERAGE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_FOCAL = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<String> preAuthRef;
    private @Nullable Reference coverage;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Boolean focal;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef} to preAuthRef.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef} to preAuthRef.
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
     * Initializes the value for the {@link ExplanationOfBenefit_Insurance#coverage() coverage} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#focal() focal} to focal.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#focal() focal} to focal.
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
     * Builds a new {@link ExplanationOfBenefit_Insurance ExplanationOfBenefit_Insurance}.
     * @return An immutable instance of ExplanationOfBenefit_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Insurance build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_Insurance(modifierExtension, preAuthRef, coverage, extension, id, focal);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean focalIsSet() {
      return (optBits & OPT_BIT_FOCAL) != 0;
    }

    private boolean coverageIsSet() {
      return (initBits & INIT_BIT_COVERAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Insurance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!coverageIsSet()) attributes.add("coverage");
      return "Cannot build ExplanationOfBenefit_Insurance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_Insurance", generator = "Immutables")
  public interface CoverageBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Reference coverage);
  }

  @Generated(from = "ExplanationOfBenefit_Insurance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(List<String> preAuthRef);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(Optional<? extends List<String>> preAuthRef);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focal(boolean focal);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Insurance#focal() focal} to focal.
     * @param focal The value for focal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focal(Optional<Boolean> focal);

    /**
     * Builds a new {@link ExplanationOfBenefit_Insurance ExplanationOfBenefit_Insurance}.
     * @return An immutable instance of ExplanationOfBenefit_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_Insurance build();
  }
}
