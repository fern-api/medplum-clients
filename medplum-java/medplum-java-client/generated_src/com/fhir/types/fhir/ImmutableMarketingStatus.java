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
 * Immutable implementation of {@link MarketingStatus}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMarketingStatus.builder()}.
 */
@Generated(from = "MarketingStatus", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMarketingStatus implements MarketingStatus {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime restoreDate;
  private final Period dateRange;
  private final @Nullable String id;
  private final CodeableConcept country;
  private final @Nullable CodeableConcept jurisdiction;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept status;

  private ImmutableMarketingStatus(
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime restoreDate,
      Period dateRange,
      @Nullable String id,
      CodeableConcept country,
      @Nullable CodeableConcept jurisdiction,
      @Nullable List<Extension> extension,
      CodeableConcept status) {
    this.modifierExtension = modifierExtension;
    this.restoreDate = restoreDate;
    this.dateRange = dateRange;
    this.id = id;
    this.country = country;
    this.jurisdiction = jurisdiction;
    this.extension = extension;
    this.status = status;
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
   * @return The value of the {@code restoreDate} attribute
   */
  @JsonProperty("restoreDate")
  @Override
  public Optional<DateTime> restoreDate() {
    return Optional.ofNullable(restoreDate);
  }

  /**
   * @return The value of the {@code dateRange} attribute
   */
  @JsonProperty("dateRange")
  @Override
  public Period dateRange() {
    return dateRange;
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
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public CodeableConcept country() {
    return country;
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<CodeableConcept> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public CodeableConcept status() {
    return status;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMarketingStatus(
        newValue,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMarketingStatus(
        value,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#restoreDate() restoreDate} attribute.
   * @param value The value for restoreDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withRestoreDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "restoreDate");
    if (this.restoreDate == newValue) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        newValue,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#restoreDate() restoreDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for restoreDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withRestoreDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.restoreDate == value) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        value,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketingStatus#dateRange() dateRange} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dateRange
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketingStatus withDateRange(Period value) {
    if (this.dateRange == value) return this;
    Period newValue = Objects.requireNonNull(value, "dateRange");
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        newValue,
        this.id,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        newValue,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        value,
        this.country,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketingStatus#country() country} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for country
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketingStatus withCountry(CodeableConcept value) {
    if (this.country == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "country");
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        this.id,
        newValue,
        this.jurisdiction,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withJurisdiction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        newValue,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withJurisdiction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        value,
        this.extension,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MarketingStatus#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketingStatus withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MarketingStatus#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMarketingStatus withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketingStatus#status() status} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketingStatus withStatus(CodeableConcept value) {
    if (this.status == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "status");
    return new ImmutableMarketingStatus(
        this.modifierExtension,
        this.restoreDate,
        this.dateRange,
        this.id,
        this.country,
        this.jurisdiction,
        this.extension,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMarketingStatus} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMarketingStatus
        && equalTo((ImmutableMarketingStatus) another);
  }

  private boolean equalTo(ImmutableMarketingStatus another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(restoreDate, another.restoreDate)
        && dateRange.equals(another.dateRange)
        && Objects.equals(id, another.id)
        && country.equals(another.country)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(extension, another.extension)
        && status.equals(another.status);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code restoreDate}, {@code dateRange}, {@code id}, {@code country}, {@code jurisdiction}, {@code extension}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(restoreDate);
    h += (h << 5) + dateRange.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + country.hashCode();
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + status.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MarketingStatus} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MarketingStatus{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (restoreDate != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("restoreDate=").append(restoreDate);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("dateRange=").append(dateRange);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("country=").append(country);
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("status=").append(status);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MarketingStatus", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MarketingStatus {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> restoreDate = Optional.empty();
    boolean restoreDateIsSet;
    @Nullable Period dateRange;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept country;
    @Nullable Optional<CodeableConcept> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept status;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("restoreDate")
    public void setRestoreDate(Optional<DateTime> restoreDate) {
      this.restoreDate = restoreDate;
      this.restoreDateIsSet = true;
    }
    @JsonProperty("dateRange")
    public void setDateRange(Period dateRange) {
      this.dateRange = dateRange;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(CodeableConcept country) {
      this.country = country;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<CodeableConcept> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(CodeableConcept status) {
      this.status = status;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> restoreDate() { throw new UnsupportedOperationException(); }
    @Override
    public Period dateRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept country() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMarketingStatus fromJson(Json json) {
    ImmutableMarketingStatus.Builder builder = ((ImmutableMarketingStatus.Builder) ImmutableMarketingStatus.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.restoreDateIsSet) {
      builder.restoreDate(json.restoreDate);
    }
    if (json.dateRange != null) {
      builder.dateRange(json.dateRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.country != null) {
      builder.country(json.country);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    return (ImmutableMarketingStatus) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MarketingStatus} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MarketingStatus instance
   */
  public static MarketingStatus copyOf(MarketingStatus instance) {
    if (instance instanceof ImmutableMarketingStatus) {
      return (ImmutableMarketingStatus) instance;
    }
    return ((ImmutableMarketingStatus.Builder) ImmutableMarketingStatus.builder())
        .modifierExtension(instance.modifierExtension())
        .restoreDate(instance.restoreDate())
        .dateRange(instance.dateRange())
        .id(instance.id())
        .country(instance.country())
        .jurisdiction(instance.jurisdiction())
        .extension(instance.extension())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link MarketingStatus MarketingStatus}.
   * <pre>
   * ImmutableMarketingStatus.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MarketingStatus#modifierExtension() modifierExtension}
   *    .restoreDate(com.fhir.types.fhir.DateTime) // optional {@link MarketingStatus#restoreDate() restoreDate}
   *    .dateRange(com.fhir.types.fhir.Period) // required {@link MarketingStatus#dateRange() dateRange}
   *    .id(String) // optional {@link MarketingStatus#id() id}
   *    .country(com.fhir.types.fhir.CodeableConcept) // required {@link MarketingStatus#country() country}
   *    .jurisdiction(com.fhir.types.fhir.CodeableConcept) // optional {@link MarketingStatus#jurisdiction() jurisdiction}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MarketingStatus#extension() extension}
   *    .status(com.fhir.types.fhir.CodeableConcept) // required {@link MarketingStatus#status() status}
   *    .build();
   * </pre>
   * @return A new MarketingStatus builder
   */
  public static DateRangeBuildStage builder() {
    return new ImmutableMarketingStatus.Builder();
  }

  /**
   * Builds instances of type {@link MarketingStatus MarketingStatus}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MarketingStatus", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements DateRangeBuildStage, CountryBuildStage, StatusBuildStage, BuildFinal {
    private static final long INIT_BIT_DATE_RANGE = 0x1L;
    private static final long INIT_BIT_COUNTRY = 0x2L;
    private static final long INIT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_RESTORE_DATE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_JURISDICTION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime restoreDate;
    private @Nullable Period dateRange;
    private @Nullable String id;
    private @Nullable CodeableConcept country;
    private @Nullable CodeableConcept jurisdiction;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder restoreDate(DateTime restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = Objects.requireNonNull(restoreDate, "restoreDate");
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("restoreDate")
    public final Builder restoreDate(Optional<? extends DateTime> restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = restoreDate.orElse(null);
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link MarketingStatus#dateRange() dateRange} attribute.
     * @param dateRange The value for dateRange 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateRange")
    public final Builder dateRange(Period dateRange) {
      checkNotIsSet(dateRangeIsSet(), "dateRange");
      this.dateRange = Objects.requireNonNull(dateRange, "dateRange");
      initBits &= ~INIT_BIT_DATE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
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
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
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
     * Initializes the value for the {@link MarketingStatus#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(CodeableConcept country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = Objects.requireNonNull(country, "country");
      initBits &= ~INIT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(CodeableConcept jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
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
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
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
     * Initializes the value for the {@link MarketingStatus#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link MarketingStatus MarketingStatus}.
     * @return An immutable instance of MarketingStatus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MarketingStatus build() {
      checkRequiredAttributes();
      return new ImmutableMarketingStatus(modifierExtension, restoreDate, dateRange, id, country, jurisdiction, extension, status);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean restoreDateIsSet() {
      return (optBits & OPT_BIT_RESTORE_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dateRangeIsSet() {
      return (initBits & INIT_BIT_DATE_RANGE) == 0;
    }

    private boolean countryIsSet() {
      return (initBits & INIT_BIT_COUNTRY) == 0;
    }

    private boolean statusIsSet() {
      return (initBits & INIT_BIT_STATUS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MarketingStatus is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!dateRangeIsSet()) attributes.add("dateRange");
      if (!countryIsSet()) attributes.add("country");
      if (!statusIsSet()) attributes.add("status");
      return "Cannot build MarketingStatus, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MarketingStatus", generator = "Immutables")
  public interface DateRangeBuildStage {
    /**
     * Initializes the value for the {@link MarketingStatus#dateRange() dateRange} attribute.
     * @param dateRange The value for dateRange 
     * @return {@code this} builder for use in a chained invocation
     */
    CountryBuildStage dateRange(Period dateRange);
  }

  @Generated(from = "MarketingStatus", generator = "Immutables")
  public interface CountryBuildStage {
    /**
     * Initializes the value for the {@link MarketingStatus#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    StatusBuildStage country(CodeableConcept country);
  }

  @Generated(from = "MarketingStatus", generator = "Immutables")
  public interface StatusBuildStage {
    /**
     * Initializes the value for the {@link MarketingStatus#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(CodeableConcept status);
  }

  @Generated(from = "MarketingStatus", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MarketingStatus#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal restoreDate(DateTime restoreDate);

    /**
     * Initializes the optional value {@link MarketingStatus#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal restoreDate(Optional<? extends DateTime> restoreDate);

    /**
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MarketingStatus#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(CodeableConcept jurisdiction);

    /**
     * Initializes the optional value {@link MarketingStatus#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MarketingStatus#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link MarketingStatus MarketingStatus}.
     * @return An immutable instance of MarketingStatus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MarketingStatus build();
  }
}
