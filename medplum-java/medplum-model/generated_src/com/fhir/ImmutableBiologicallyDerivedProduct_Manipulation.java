package com.fhir;

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
 * Immutable implementation of {@link BiologicallyDerivedProduct_Manipulation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBiologicallyDerivedProduct_Manipulation.builder()}.
 */
@Generated(from = "BiologicallyDerivedProduct_Manipulation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBiologicallyDerivedProduct_Manipulation
    implements BiologicallyDerivedProduct_Manipulation {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable String description;
  private final @Nullable List<Extension> extension;
  private final @Nullable String timeDateTime;
  private final @Nullable Period timePeriod;

  private ImmutableBiologicallyDerivedProduct_Manipulation(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable String description,
      @Nullable List<Extension> extension,
      @Nullable String timeDateTime,
      @Nullable Period timePeriod) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.description = description;
    this.extension = extension;
    this.timeDateTime = timeDateTime;
    this.timePeriod = timePeriod;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code timeDateTime} attribute
   */
  @JsonProperty("timeDateTime")
  @Override
  public Optional<String> timeDateTime() {
    return Optional.ofNullable(timeDateTime);
  }

  /**
   * @return The value of the {@code timePeriod} attribute
   */
  @JsonProperty("timePeriod")
  @Override
  public Optional<Period> timePeriod() {
    return Optional.ofNullable(timePeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Manipulation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(newValue, this.id, this.description, this.extension, this.timeDateTime, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Manipulation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Manipulation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(value, this.id, this.description, this.extension, this.timeDateTime, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Manipulation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(
        this.modifierExtension,
        newValue,
        this.description,
        this.extension,
        this.timeDateTime,
        this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Manipulation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(
        this.modifierExtension,
        value,
        this.description,
        this.extension,
        this.timeDateTime,
        this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Manipulation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, newValue, this.extension, this.timeDateTime, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Manipulation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, value, this.extension, this.timeDateTime, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Manipulation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, this.description, newValue, this.timeDateTime, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Manipulation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Manipulation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, this.description, value, this.timeDateTime, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Manipulation#timeDateTime() timeDateTime} attribute.
   * @param value The value for timeDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withTimeDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timeDateTime");
    if (Objects.equals(this.timeDateTime, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, this.description, this.extension, newValue, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Manipulation#timeDateTime() timeDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withTimeDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timeDateTime, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, this.description, this.extension, value, this.timePeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Manipulation#timePeriod() timePeriod} attribute.
   * @param value The value for timePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Manipulation withTimePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timePeriod");
    if (this.timePeriod == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, this.description, this.extension, this.timeDateTime, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Manipulation#timePeriod() timePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Manipulation withTimePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timePeriod == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Manipulation(this.modifierExtension, this.id, this.description, this.extension, this.timeDateTime, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBiologicallyDerivedProduct_Manipulation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBiologicallyDerivedProduct_Manipulation
        && equalTo((ImmutableBiologicallyDerivedProduct_Manipulation) another);
  }

  private boolean equalTo(ImmutableBiologicallyDerivedProduct_Manipulation another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension)
        && Objects.equals(timeDateTime, another.timeDateTime)
        && Objects.equals(timePeriod, another.timePeriod);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code description}, {@code extension}, {@code timeDateTime}, {@code timePeriod}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(timeDateTime);
    h += (h << 5) + Objects.hashCode(timePeriod);
    return h;
  }

  /**
   * Prints the immutable value {@code BiologicallyDerivedProduct_Manipulation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("BiologicallyDerivedProduct_Manipulation{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (timeDateTime != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("timeDateTime=").append(timeDateTime);
    }
    if (timePeriod != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("timePeriod=").append(timePeriod);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BiologicallyDerivedProduct_Manipulation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BiologicallyDerivedProduct_Manipulation {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> timeDateTime = Optional.empty();
    boolean timeDateTimeIsSet;
    @Nullable Optional<Period> timePeriod = Optional.empty();
    boolean timePeriodIsSet;
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
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("timeDateTime")
    public void setTimeDateTime(Optional<String> timeDateTime) {
      this.timeDateTime = timeDateTime;
      this.timeDateTimeIsSet = true;
    }
    @JsonProperty("timePeriod")
    public void setTimePeriod(Optional<Period> timePeriod) {
      this.timePeriod = timePeriod;
      this.timePeriodIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timeDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timePeriod() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBiologicallyDerivedProduct_Manipulation fromJson(Json json) {
    ImmutableBiologicallyDerivedProduct_Manipulation.Builder builder = ImmutableBiologicallyDerivedProduct_Manipulation.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.timeDateTimeIsSet) {
      builder.timeDateTime(json.timeDateTime);
    }
    if (json.timePeriodIsSet) {
      builder.timePeriod(json.timePeriod);
    }
    return (ImmutableBiologicallyDerivedProduct_Manipulation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link BiologicallyDerivedProduct_Manipulation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BiologicallyDerivedProduct_Manipulation instance
   */
  public static BiologicallyDerivedProduct_Manipulation copyOf(BiologicallyDerivedProduct_Manipulation instance) {
    if (instance instanceof ImmutableBiologicallyDerivedProduct_Manipulation) {
      return (ImmutableBiologicallyDerivedProduct_Manipulation) instance;
    }
    return ImmutableBiologicallyDerivedProduct_Manipulation.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .description(instance.description())
        .extension(instance.extension())
        .timeDateTime(instance.timeDateTime())
        .timePeriod(instance.timePeriod())
        .build();
  }

  /**
   * Creates a builder for {@link BiologicallyDerivedProduct_Manipulation BiologicallyDerivedProduct_Manipulation}.
   * <pre>
   * ImmutableBiologicallyDerivedProduct_Manipulation.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Manipulation#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link BiologicallyDerivedProduct_Manipulation#id() id}
   *    .description(String) // optional {@link BiologicallyDerivedProduct_Manipulation#description() description}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Manipulation#extension() extension}
   *    .timeDateTime(String) // optional {@link BiologicallyDerivedProduct_Manipulation#timeDateTime() timeDateTime}
   *    .timePeriod(com.fhir.Period) // optional {@link BiologicallyDerivedProduct_Manipulation#timePeriod() timePeriod}
   *    .build();
   * </pre>
   * @return A new BiologicallyDerivedProduct_Manipulation builder
   */
  public static ImmutableBiologicallyDerivedProduct_Manipulation.Builder builder() {
    return new ImmutableBiologicallyDerivedProduct_Manipulation.Builder();
  }

  /**
   * Builds instances of type {@link BiologicallyDerivedProduct_Manipulation BiologicallyDerivedProduct_Manipulation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BiologicallyDerivedProduct_Manipulation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_TIME_DATE_TIME = 0x10L;
    private static final long OPT_BIT_TIME_PERIOD = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable String description;
    private @Nullable List<Extension> extension;
    private @Nullable String timeDateTime;
    private @Nullable Period timePeriod;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#timeDateTime() timeDateTime} to timeDateTime.
     * @param timeDateTime The value for timeDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeDateTime(String timeDateTime) {
      checkNotIsSet(timeDateTimeIsSet(), "timeDateTime");
      this.timeDateTime = Objects.requireNonNull(timeDateTime, "timeDateTime");
      optBits |= OPT_BIT_TIME_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#timeDateTime() timeDateTime} to timeDateTime.
     * @param timeDateTime The value for timeDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timeDateTime")
    public final Builder timeDateTime(Optional<String> timeDateTime) {
      checkNotIsSet(timeDateTimeIsSet(), "timeDateTime");
      this.timeDateTime = timeDateTime.orElse(null);
      optBits |= OPT_BIT_TIME_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#timePeriod() timePeriod} to timePeriod.
     * @param timePeriod The value for timePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timePeriod(Period timePeriod) {
      checkNotIsSet(timePeriodIsSet(), "timePeriod");
      this.timePeriod = Objects.requireNonNull(timePeriod, "timePeriod");
      optBits |= OPT_BIT_TIME_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Manipulation#timePeriod() timePeriod} to timePeriod.
     * @param timePeriod The value for timePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timePeriod")
    public final Builder timePeriod(Optional<? extends Period> timePeriod) {
      checkNotIsSet(timePeriodIsSet(), "timePeriod");
      this.timePeriod = timePeriod.orElse(null);
      optBits |= OPT_BIT_TIME_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link BiologicallyDerivedProduct_Manipulation BiologicallyDerivedProduct_Manipulation}.
     * @return An immutable instance of BiologicallyDerivedProduct_Manipulation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public BiologicallyDerivedProduct_Manipulation build() {
      return new ImmutableBiologicallyDerivedProduct_Manipulation(modifierExtension, id, description, extension, timeDateTime, timePeriod);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean timeDateTimeIsSet() {
      return (optBits & OPT_BIT_TIME_DATE_TIME) != 0;
    }

    private boolean timePeriodIsSet() {
      return (optBits & OPT_BIT_TIME_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of BiologicallyDerivedProduct_Manipulation is strict, attribute is already set: ".concat(name));
    }
  }
}
