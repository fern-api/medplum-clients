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
 * Immutable implementation of {@link CoverageEligibilityResponse_Insurance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityResponse_Insurance.builder()}.
 */
@Generated(from = "CoverageEligibilityResponse_Insurance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityResponse_Insurance
    implements CoverageEligibilityResponse_Insurance {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period benefitPeriod;
  private final @Nullable List<CoverageEligibilityResponse_Item> item;
  private final @Nullable String id;
  private final @Nullable Boolean inforce;
  private final @Nullable List<Extension> extension;
  private final Reference coverage;

  private ImmutableCoverageEligibilityResponse_Insurance(
      @Nullable List<Extension> modifierExtension,
      @Nullable Period benefitPeriod,
      @Nullable List<CoverageEligibilityResponse_Item> item,
      @Nullable String id,
      @Nullable Boolean inforce,
      @Nullable List<Extension> extension,
      Reference coverage) {
    this.modifierExtension = modifierExtension;
    this.benefitPeriod = benefitPeriod;
    this.item = item;
    this.id = id;
    this.inforce = inforce;
    this.extension = extension;
    this.coverage = coverage;
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
   * @return The value of the {@code benefitPeriod} attribute
   */
  @JsonProperty("benefitPeriod")
  @Override
  public Optional<Period> benefitPeriod() {
    return Optional.ofNullable(benefitPeriod);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<CoverageEligibilityResponse_Item>> item() {
    return Optional.ofNullable(item);
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
   * @return The value of the {@code inforce} attribute
   */
  @JsonProperty("inforce")
  @Override
  public Optional<Boolean> inforce() {
    return Optional.ofNullable(inforce);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(newValue, this.benefitPeriod, this.item, this.id, this.inforce, this.extension, this.coverage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Insurance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(value, this.benefitPeriod, this.item, this.id, this.inforce, this.extension, this.coverage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod} attribute.
   * @param value The value for benefitPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withBenefitPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "benefitPeriod");
    if (this.benefitPeriod == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        newValue,
        this.item,
        this.id,
        this.inforce,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefitPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Insurance withBenefitPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.benefitPeriod == value) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(this.modifierExtension, value, this.item, this.id, this.inforce, this.extension, this.coverage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Insurance#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withItem(List<CoverageEligibilityResponse_Item> value) {
    @Nullable List<CoverageEligibilityResponse_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        newValue,
        this.id,
        this.inforce,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Insurance#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Insurance withItem(Optional<? extends List<CoverageEligibilityResponse_Item>> optional) {
    @Nullable List<CoverageEligibilityResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        value,
        this.id,
        this.inforce,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Insurance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        newValue,
        this.inforce,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Insurance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        value,
        this.inforce,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Insurance#inforce() inforce} attribute.
   * @param value The value for inforce
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withInforce(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.inforce, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        this.id,
        newValue,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Insurance#inforce() inforce} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inforce
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withInforce(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.inforce, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        this.id,
        value,
        this.extension,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Insurance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        this.id,
        this.inforce,
        newValue,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Insurance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Insurance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        this.id,
        this.inforce,
        value,
        this.coverage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityResponse_Insurance#coverage() coverage} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coverage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Insurance withCoverage(Reference value) {
    if (this.coverage == value) return this;
    Reference newValue = Objects.requireNonNull(value, "coverage");
    return new ImmutableCoverageEligibilityResponse_Insurance(
        this.modifierExtension,
        this.benefitPeriod,
        this.item,
        this.id,
        this.inforce,
        this.extension,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityResponse_Insurance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityResponse_Insurance
        && equalTo((ImmutableCoverageEligibilityResponse_Insurance) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityResponse_Insurance another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(benefitPeriod, another.benefitPeriod)
        && Objects.equals(item, another.item)
        && Objects.equals(id, another.id)
        && Objects.equals(inforce, another.inforce)
        && Objects.equals(extension, another.extension)
        && coverage.equals(another.coverage);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code benefitPeriod}, {@code item}, {@code id}, {@code inforce}, {@code extension}, {@code coverage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(benefitPeriod);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(inforce);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + coverage.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityResponse_Insurance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityResponse_Insurance{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (benefitPeriod != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("benefitPeriod=").append(benefitPeriod);
    }
    if (item != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (id != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (inforce != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("inforce=").append(inforce);
    }
    if (extension != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 38) builder.append(", ");
    builder.append("coverage=").append(coverage);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityResponse_Insurance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityResponse_Insurance {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> benefitPeriod = Optional.empty();
    boolean benefitPeriodIsSet;
    @Nullable Optional<List<CoverageEligibilityResponse_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> inforce = Optional.empty();
    boolean inforceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference coverage;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("benefitPeriod")
    public void setBenefitPeriod(Optional<Period> benefitPeriod) {
      this.benefitPeriod = benefitPeriod;
      this.benefitPeriodIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<CoverageEligibilityResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("inforce")
    public void setInforce(Optional<Boolean> inforce) {
      this.inforce = inforce;
      this.inforceIsSet = true;
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
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> benefitPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> inforce() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference coverage() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityResponse_Insurance fromJson(Json json) {
    ImmutableCoverageEligibilityResponse_Insurance.Builder builder = ((ImmutableCoverageEligibilityResponse_Insurance.Builder) ImmutableCoverageEligibilityResponse_Insurance.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.benefitPeriodIsSet) {
      builder.benefitPeriod(json.benefitPeriod);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.inforceIsSet) {
      builder.inforce(json.inforce);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.coverage != null) {
      builder.coverage(json.coverage);
    }
    return (ImmutableCoverageEligibilityResponse_Insurance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityResponse_Insurance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityResponse_Insurance instance
   */
  public static CoverageEligibilityResponse_Insurance copyOf(CoverageEligibilityResponse_Insurance instance) {
    if (instance instanceof ImmutableCoverageEligibilityResponse_Insurance) {
      return (ImmutableCoverageEligibilityResponse_Insurance) instance;
    }
    return ((ImmutableCoverageEligibilityResponse_Insurance.Builder) ImmutableCoverageEligibilityResponse_Insurance.builder())
        .modifierExtension(instance.modifierExtension())
        .benefitPeriod(instance.benefitPeriod())
        .item(instance.item())
        .id(instance.id())
        .inforce(instance.inforce())
        .extension(instance.extension())
        .coverage(instance.coverage())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityResponse_Insurance CoverageEligibilityResponse_Insurance}.
   * <pre>
   * ImmutableCoverageEligibilityResponse_Insurance.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension}
   *    .benefitPeriod(com.fhir.Period) // optional {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod}
   *    .item(List&amp;lt;com.fhir.CoverageEligibilityResponse_Item&amp;gt;) // optional {@link CoverageEligibilityResponse_Insurance#item() item}
   *    .id(String) // optional {@link CoverageEligibilityResponse_Insurance#id() id}
   *    .inforce(Boolean) // optional {@link CoverageEligibilityResponse_Insurance#inforce() inforce}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Insurance#extension() extension}
   *    .coverage(com.fhir.Reference) // required {@link CoverageEligibilityResponse_Insurance#coverage() coverage}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityResponse_Insurance builder
   */
  public static CoverageBuildStage builder() {
    return new ImmutableCoverageEligibilityResponse_Insurance.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityResponse_Insurance CoverageEligibilityResponse_Insurance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoverageEligibilityResponse_Insurance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CoverageBuildStage, BuildFinal {
    private static final long INIT_BIT_COVERAGE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_BENEFIT_PERIOD = 0x2L;
    private static final long OPT_BIT_ITEM = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_INFORCE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period benefitPeriod;
    private @Nullable List<CoverageEligibilityResponse_Item> item;
    private @Nullable String id;
    private @Nullable Boolean inforce;
    private @Nullable List<Extension> extension;
    private @Nullable Reference coverage;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefitPeriod(Period benefitPeriod) {
      checkNotIsSet(benefitPeriodIsSet(), "benefitPeriod");
      this.benefitPeriod = Objects.requireNonNull(benefitPeriod, "benefitPeriod");
      optBits |= OPT_BIT_BENEFIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("benefitPeriod")
    public final Builder benefitPeriod(Optional<? extends Period> benefitPeriod) {
      checkNotIsSet(benefitPeriodIsSet(), "benefitPeriod");
      this.benefitPeriod = benefitPeriod.orElse(null);
      optBits |= OPT_BIT_BENEFIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<CoverageEligibilityResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<CoverageEligibilityResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#inforce() inforce} to inforce.
     * @param inforce The value for inforce
     * @return {@code this} builder for chained invocation
     */
    public final Builder inforce(boolean inforce) {
      checkNotIsSet(inforceIsSet(), "inforce");
      this.inforce = inforce;
      optBits |= OPT_BIT_INFORCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#inforce() inforce} to inforce.
     * @param inforce The value for inforce
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inforce")
    public final Builder inforce(Optional<Boolean> inforce) {
      checkNotIsSet(inforceIsSet(), "inforce");
      this.inforce = inforce.orElse(null);
      optBits |= OPT_BIT_INFORCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#extension() extension} to extension.
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
     * Initializes the value for the {@link CoverageEligibilityResponse_Insurance#coverage() coverage} attribute.
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
     * Builds a new {@link CoverageEligibilityResponse_Insurance CoverageEligibilityResponse_Insurance}.
     * @return An immutable instance of CoverageEligibilityResponse_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityResponse_Insurance build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityResponse_Insurance(modifierExtension, benefitPeriod, item, id, inforce, extension, coverage);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean benefitPeriodIsSet() {
      return (optBits & OPT_BIT_BENEFIT_PERIOD) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean inforceIsSet() {
      return (optBits & OPT_BIT_INFORCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean coverageIsSet() {
      return (initBits & INIT_BIT_COVERAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityResponse_Insurance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!coverageIsSet()) attributes.add("coverage");
      return "Cannot build CoverageEligibilityResponse_Insurance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CoverageEligibilityResponse_Insurance", generator = "Immutables")
  public interface CoverageBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityResponse_Insurance#coverage() coverage} attribute.
     * @param coverage The value for coverage 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Reference coverage);
  }

  @Generated(from = "CoverageEligibilityResponse_Insurance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal benefitPeriod(Period benefitPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal benefitPeriod(Optional<? extends Period> benefitPeriod);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<CoverageEligibilityResponse_Item> item);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<CoverageEligibilityResponse_Item>> item);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#inforce() inforce} to inforce.
     * @param inforce The value for inforce
     * @return {@code this} builder for chained invocation
     */
    BuildFinal inforce(boolean inforce);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#inforce() inforce} to inforce.
     * @param inforce The value for inforce
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal inforce(Optional<Boolean> inforce);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Insurance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link CoverageEligibilityResponse_Insurance CoverageEligibilityResponse_Insurance}.
     * @return An immutable instance of CoverageEligibilityResponse_Insurance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityResponse_Insurance build();
  }
}
