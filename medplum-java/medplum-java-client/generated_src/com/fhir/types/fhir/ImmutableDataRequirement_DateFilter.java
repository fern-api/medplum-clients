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
 * Immutable implementation of {@link DataRequirement_DateFilter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDataRequirement_DateFilter.builder()}.
 */
@Generated(from = "DataRequirement_DateFilter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDataRequirement_DateFilter
    implements DataRequirement_DateFilter {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String valueDateTime;
  private final @Nullable Period valuePeriod;
  private final @Nullable String searchParam;
  private final @Nullable String id;
  private final @Nullable Duration valueDuration;
  private final @Nullable List<Extension> extension;
  private final @Nullable String path;

  private ImmutableDataRequirement_DateFilter(
      @Nullable List<Extension> modifierExtension,
      @Nullable String valueDateTime,
      @Nullable Period valuePeriod,
      @Nullable String searchParam,
      @Nullable String id,
      @Nullable Duration valueDuration,
      @Nullable List<Extension> extension,
      @Nullable String path) {
    this.modifierExtension = modifierExtension;
    this.valueDateTime = valueDateTime;
    this.valuePeriod = valuePeriod;
    this.searchParam = searchParam;
    this.id = id;
    this.valueDuration = valueDuration;
    this.extension = extension;
    this.path = path;
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
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code valuePeriod} attribute
   */
  @JsonProperty("valuePeriod")
  @Override
  public Optional<Period> valuePeriod() {
    return Optional.ofNullable(valuePeriod);
  }

  /**
   * @return The value of the {@code searchParam} attribute
   */
  @JsonProperty("searchParam")
  @Override
  public Optional<String> searchParam() {
    return Optional.ofNullable(searchParam);
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
   * @return The value of the {@code valueDuration} attribute
   */
  @JsonProperty("valueDuration")
  @Override
  public Optional<Duration> valueDuration() {
    return Optional.ofNullable(valueDuration);
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
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDataRequirement_DateFilter(
        newValue,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_DateFilter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDataRequirement_DateFilter(
        value,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        newValue,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        value,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        newValue,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_DateFilter withValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        value,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withSearchParam(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "searchParam");
    if (Objects.equals(this.searchParam, newValue)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        newValue,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#searchParam() searchParam} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withSearchParam(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.searchParam, value)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        value,
        this.id,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        newValue,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        value,
        this.valueDuration,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#valueDuration() valueDuration} attribute.
   * @param value The value for valueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withValueDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "valueDuration");
    if (this.valueDuration == newValue) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        newValue,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#valueDuration() valueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_DateFilter withValueDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.valueDuration == value) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        value,
        this.extension,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        newValue,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDataRequirement_DateFilter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        value,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DataRequirement_DateFilter#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DataRequirement_DateFilter#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDataRequirement_DateFilter withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableDataRequirement_DateFilter(
        this.modifierExtension,
        this.valueDateTime,
        this.valuePeriod,
        this.searchParam,
        this.id,
        this.valueDuration,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDataRequirement_DateFilter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDataRequirement_DateFilter
        && equalTo((ImmutableDataRequirement_DateFilter) another);
  }

  private boolean equalTo(ImmutableDataRequirement_DateFilter another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valuePeriod, another.valuePeriod)
        && Objects.equals(searchParam, another.searchParam)
        && Objects.equals(id, another.id)
        && Objects.equals(valueDuration, another.valueDuration)
        && Objects.equals(extension, another.extension)
        && Objects.equals(path, another.path);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code valueDateTime}, {@code valuePeriod}, {@code searchParam}, {@code id}, {@code valueDuration}, {@code extension}, {@code path}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valuePeriod);
    h += (h << 5) + Objects.hashCode(searchParam);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueDuration);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(path);
    return h;
  }

  /**
   * Prints the immutable value {@code DataRequirement_DateFilter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DataRequirement_DateFilter{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueDateTime != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valuePeriod != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (searchParam != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("searchParam=").append(searchParam);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueDuration != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueDuration=").append(valueDuration);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (path != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("path=").append(path);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DataRequirement_DateFilter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DataRequirement_DateFilter {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<Period> valuePeriod = Optional.empty();
    boolean valuePeriodIsSet;
    @Nullable Optional<String> searchParam = Optional.empty();
    boolean searchParamIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Duration> valueDuration = Optional.empty();
    boolean valueDurationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Optional<Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @JsonProperty("searchParam")
    public void setSearchParam(Optional<String> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueDuration")
    public void setValueDuration(Optional<Duration> valueDuration) {
      this.valueDuration = valueDuration;
      this.valueDurationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> searchParam() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> valueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDataRequirement_DateFilter fromJson(Json json) {
    ImmutableDataRequirement_DateFilter.Builder builder = ImmutableDataRequirement_DateFilter.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueDurationIsSet) {
      builder.valueDuration(json.valueDuration);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    return (ImmutableDataRequirement_DateFilter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DataRequirement_DateFilter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DataRequirement_DateFilter instance
   */
  public static DataRequirement_DateFilter copyOf(DataRequirement_DateFilter instance) {
    if (instance instanceof ImmutableDataRequirement_DateFilter) {
      return (ImmutableDataRequirement_DateFilter) instance;
    }
    return ImmutableDataRequirement_DateFilter.builder()
        .modifierExtension(instance.modifierExtension())
        .valueDateTime(instance.valueDateTime())
        .valuePeriod(instance.valuePeriod())
        .searchParam(instance.searchParam())
        .id(instance.id())
        .valueDuration(instance.valueDuration())
        .extension(instance.extension())
        .path(instance.path())
        .build();
  }

  /**
   * Creates a builder for {@link DataRequirement_DateFilter DataRequirement_DateFilter}.
   * <pre>
   * ImmutableDataRequirement_DateFilter.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DataRequirement_DateFilter#modifierExtension() modifierExtension}
   *    .valueDateTime(String) // optional {@link DataRequirement_DateFilter#valueDateTime() valueDateTime}
   *    .valuePeriod(com.fhir.types.fhir.Period) // optional {@link DataRequirement_DateFilter#valuePeriod() valuePeriod}
   *    .searchParam(String) // optional {@link DataRequirement_DateFilter#searchParam() searchParam}
   *    .id(String) // optional {@link DataRequirement_DateFilter#id() id}
   *    .valueDuration(com.fhir.types.fhir.Duration) // optional {@link DataRequirement_DateFilter#valueDuration() valueDuration}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DataRequirement_DateFilter#extension() extension}
   *    .path(String) // optional {@link DataRequirement_DateFilter#path() path}
   *    .build();
   * </pre>
   * @return A new DataRequirement_DateFilter builder
   */
  public static ImmutableDataRequirement_DateFilter.Builder builder() {
    return new ImmutableDataRequirement_DateFilter.Builder();
  }

  /**
   * Builds instances of type {@link DataRequirement_DateFilter DataRequirement_DateFilter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DataRequirement_DateFilter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x2L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x4L;
    private static final long OPT_BIT_SEARCH_PARAM = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_VALUE_DURATION = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_PATH = 0x80L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String valueDateTime;
    private @Nullable Period valuePeriod;
    private @Nullable String searchParam;
    private @Nullable String id;
    private @Nullable Duration valueDuration;
    private @Nullable List<Extension> extension;
    private @Nullable String path;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_DateFilter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DataRequirement_DateFilter#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDateTime")
    public final Builder valueDateTime(Optional<String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePeriod(Period valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = Objects.requireNonNull(valuePeriod, "valuePeriod");
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valuePeriod")
    public final Builder valuePeriod(Optional<? extends Period> valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = valuePeriod.orElse(null);
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchParam(String searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchParam")
    public final Builder searchParam(Optional<String> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_DateFilter#id() id} to id.
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
     * Initializes the optional value {@link DataRequirement_DateFilter#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDuration(Duration valueDuration) {
      checkNotIsSet(valueDurationIsSet(), "valueDuration");
      this.valueDuration = Objects.requireNonNull(valueDuration, "valueDuration");
      optBits |= OPT_BIT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDuration")
    public final Builder valueDuration(Optional<? extends Duration> valueDuration) {
      checkNotIsSet(valueDurationIsSet(), "valueDuration");
      this.valueDuration = valueDuration.orElse(null);
      optBits |= OPT_BIT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_DateFilter#extension() extension} to extension.
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
     * Initializes the optional value {@link DataRequirement_DateFilter#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link DataRequirement_DateFilter#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("path")
    public final Builder path(Optional<String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Builds a new {@link DataRequirement_DateFilter DataRequirement_DateFilter}.
     * @return An immutable instance of DataRequirement_DateFilter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DataRequirement_DateFilter build() {
      return new ImmutableDataRequirement_DateFilter(
          modifierExtension,
          valueDateTime,
          valuePeriod,
          searchParam,
          id,
          valueDuration,
          extension,
          path);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueDurationIsSet() {
      return (optBits & OPT_BIT_VALUE_DURATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DataRequirement_DateFilter is strict, attribute is already set: ".concat(name));
    }
  }
}
