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
 * Immutable implementation of {@link BiologicallyDerivedProduct_Collection}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBiologicallyDerivedProduct_Collection.builder()}.
 */
@Generated(from = "BiologicallyDerivedProduct_Collection", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBiologicallyDerivedProduct_Collection
    implements BiologicallyDerivedProduct_Collection {
  private final @Nullable Reference collector;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference source;
  private final @Nullable String collectedDateTime;
  private final @Nullable Period collectedPeriod;

  private ImmutableBiologicallyDerivedProduct_Collection(
      @Nullable Reference collector,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Reference source,
      @Nullable String collectedDateTime,
      @Nullable Period collectedPeriod) {
    this.collector = collector;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.source = source;
    this.collectedDateTime = collectedDateTime;
    this.collectedPeriod = collectedPeriod;
  }

  /**
   * @return The value of the {@code collector} attribute
   */
  @JsonProperty("collector")
  @Override
  public Optional<Reference> collector() {
    return Optional.ofNullable(collector);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Reference> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code collectedDateTime} attribute
   */
  @JsonProperty("collectedDateTime")
  @Override
  public Optional<String> collectedDateTime() {
    return Optional.ofNullable(collectedDateTime);
  }

  /**
   * @return The value of the {@code collectedPeriod} attribute
   */
  @JsonProperty("collectedPeriod")
  @Override
  public Optional<Period> collectedPeriod() {
    return Optional.ofNullable(collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#collector() collector} attribute.
   * @param value The value for collector
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withCollector(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "collector");
    if (this.collector == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        newValue,
        this.id,
        this.modifierExtension,
        this.extension,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#collector() collector} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collector
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Collection withCollector(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.collector == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        value,
        this.id,
        this.modifierExtension,
        this.extension,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        newValue,
        this.modifierExtension,
        this.extension,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        value,
        this.modifierExtension,
        this.extension,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        newValue,
        this.extension,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Collection withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        value,
        this.extension,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        newValue,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Collection withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        value,
        this.source,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        this.extension,
        newValue,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Collection withSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        this.extension,
        value,
        this.collectedDateTime,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#collectedDateTime() collectedDateTime} attribute.
   * @param value The value for collectedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withCollectedDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "collectedDateTime");
    if (Objects.equals(this.collectedDateTime, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        this.extension,
        this.source,
        newValue,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#collectedDateTime() collectedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collectedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withCollectedDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.collectedDateTime, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        this.extension,
        this.source,
        value,
        this.collectedPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Collection#collectedPeriod() collectedPeriod} attribute.
   * @param value The value for collectedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Collection withCollectedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "collectedPeriod");
    if (this.collectedPeriod == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        this.extension,
        this.source,
        this.collectedDateTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Collection#collectedPeriod() collectedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collectedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Collection withCollectedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.collectedPeriod == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Collection(
        this.collector,
        this.id,
        this.modifierExtension,
        this.extension,
        this.source,
        this.collectedDateTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBiologicallyDerivedProduct_Collection} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBiologicallyDerivedProduct_Collection
        && equalTo((ImmutableBiologicallyDerivedProduct_Collection) another);
  }

  private boolean equalTo(ImmutableBiologicallyDerivedProduct_Collection another) {
    return Objects.equals(collector, another.collector)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(source, another.source)
        && Objects.equals(collectedDateTime, another.collectedDateTime)
        && Objects.equals(collectedPeriod, another.collectedPeriod);
  }

  /**
   * Computes a hash code from attributes: {@code collector}, {@code id}, {@code modifierExtension}, {@code extension}, {@code source}, {@code collectedDateTime}, {@code collectedPeriod}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(collector);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(collectedDateTime);
    h += (h << 5) + Objects.hashCode(collectedPeriod);
    return h;
  }

  /**
   * Prints the immutable value {@code BiologicallyDerivedProduct_Collection} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("BiologicallyDerivedProduct_Collection{");
    if (collector != null) {
      builder.append("collector=").append(collector);
    }
    if (id != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (source != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (collectedDateTime != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("collectedDateTime=").append(collectedDateTime);
    }
    if (collectedPeriod != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("collectedPeriod=").append(collectedPeriod);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BiologicallyDerivedProduct_Collection", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BiologicallyDerivedProduct_Collection {
    @Nullable Optional<Reference> collector = Optional.empty();
    boolean collectorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<String> collectedDateTime = Optional.empty();
    boolean collectedDateTimeIsSet;
    @Nullable Optional<Period> collectedPeriod = Optional.empty();
    boolean collectedPeriodIsSet;
    @JsonProperty("collector")
    public void setCollector(Optional<Reference> collector) {
      this.collector = collector;
      this.collectorIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("collectedDateTime")
    public void setCollectedDateTime(Optional<String> collectedDateTime) {
      this.collectedDateTime = collectedDateTime;
      this.collectedDateTimeIsSet = true;
    }
    @JsonProperty("collectedPeriod")
    public void setCollectedPeriod(Optional<Period> collectedPeriod) {
      this.collectedPeriod = collectedPeriod;
      this.collectedPeriodIsSet = true;
    }
    @Override
    public Optional<Reference> collector() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> collectedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> collectedPeriod() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBiologicallyDerivedProduct_Collection fromJson(Json json) {
    ImmutableBiologicallyDerivedProduct_Collection.Builder builder = ImmutableBiologicallyDerivedProduct_Collection.builder();
    if (json.collectorIsSet) {
      builder.collector(json.collector);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.collectedDateTimeIsSet) {
      builder.collectedDateTime(json.collectedDateTime);
    }
    if (json.collectedPeriodIsSet) {
      builder.collectedPeriod(json.collectedPeriod);
    }
    return (ImmutableBiologicallyDerivedProduct_Collection) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link BiologicallyDerivedProduct_Collection} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BiologicallyDerivedProduct_Collection instance
   */
  public static BiologicallyDerivedProduct_Collection copyOf(BiologicallyDerivedProduct_Collection instance) {
    if (instance instanceof ImmutableBiologicallyDerivedProduct_Collection) {
      return (ImmutableBiologicallyDerivedProduct_Collection) instance;
    }
    return ImmutableBiologicallyDerivedProduct_Collection.builder()
        .collector(instance.collector())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .source(instance.source())
        .collectedDateTime(instance.collectedDateTime())
        .collectedPeriod(instance.collectedPeriod())
        .build();
  }

  /**
   * Creates a builder for {@link BiologicallyDerivedProduct_Collection BiologicallyDerivedProduct_Collection}.
   * <pre>
   * ImmutableBiologicallyDerivedProduct_Collection.builder()
   *    .collector(com.fhir.Reference) // optional {@link BiologicallyDerivedProduct_Collection#collector() collector}
   *    .id(String) // optional {@link BiologicallyDerivedProduct_Collection#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Collection#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Collection#extension() extension}
   *    .source(com.fhir.Reference) // optional {@link BiologicallyDerivedProduct_Collection#source() source}
   *    .collectedDateTime(String) // optional {@link BiologicallyDerivedProduct_Collection#collectedDateTime() collectedDateTime}
   *    .collectedPeriod(com.fhir.Period) // optional {@link BiologicallyDerivedProduct_Collection#collectedPeriod() collectedPeriod}
   *    .build();
   * </pre>
   * @return A new BiologicallyDerivedProduct_Collection builder
   */
  public static ImmutableBiologicallyDerivedProduct_Collection.Builder builder() {
    return new ImmutableBiologicallyDerivedProduct_Collection.Builder();
  }

  /**
   * Builds instances of type {@link BiologicallyDerivedProduct_Collection BiologicallyDerivedProduct_Collection}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BiologicallyDerivedProduct_Collection", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_COLLECTOR = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_COLLECTED_DATE_TIME = 0x20L;
    private static final long OPT_BIT_COLLECTED_PERIOD = 0x40L;
    private long optBits;

    private @Nullable Reference collector;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Reference source;
    private @Nullable String collectedDateTime;
    private @Nullable Period collectedPeriod;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#collector() collector} to collector.
     * @param collector The value for collector
     * @return {@code this} builder for chained invocation
     */
    public final Builder collector(Reference collector) {
      checkNotIsSet(collectorIsSet(), "collector");
      this.collector = Objects.requireNonNull(collector, "collector");
      optBits |= OPT_BIT_COLLECTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#collector() collector} to collector.
     * @param collector The value for collector
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collector")
    public final Builder collector(Optional<? extends Reference> collector) {
      checkNotIsSet(collectorIsSet(), "collector");
      this.collector = collector.orElse(null);
      optBits |= OPT_BIT_COLLECTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#collectedDateTime() collectedDateTime} to collectedDateTime.
     * @param collectedDateTime The value for collectedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder collectedDateTime(String collectedDateTime) {
      checkNotIsSet(collectedDateTimeIsSet(), "collectedDateTime");
      this.collectedDateTime = Objects.requireNonNull(collectedDateTime, "collectedDateTime");
      optBits |= OPT_BIT_COLLECTED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#collectedDateTime() collectedDateTime} to collectedDateTime.
     * @param collectedDateTime The value for collectedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collectedDateTime")
    public final Builder collectedDateTime(Optional<String> collectedDateTime) {
      checkNotIsSet(collectedDateTimeIsSet(), "collectedDateTime");
      this.collectedDateTime = collectedDateTime.orElse(null);
      optBits |= OPT_BIT_COLLECTED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#collectedPeriod() collectedPeriod} to collectedPeriod.
     * @param collectedPeriod The value for collectedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder collectedPeriod(Period collectedPeriod) {
      checkNotIsSet(collectedPeriodIsSet(), "collectedPeriod");
      this.collectedPeriod = Objects.requireNonNull(collectedPeriod, "collectedPeriod");
      optBits |= OPT_BIT_COLLECTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Collection#collectedPeriod() collectedPeriod} to collectedPeriod.
     * @param collectedPeriod The value for collectedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collectedPeriod")
    public final Builder collectedPeriod(Optional<? extends Period> collectedPeriod) {
      checkNotIsSet(collectedPeriodIsSet(), "collectedPeriod");
      this.collectedPeriod = collectedPeriod.orElse(null);
      optBits |= OPT_BIT_COLLECTED_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link BiologicallyDerivedProduct_Collection BiologicallyDerivedProduct_Collection}.
     * @return An immutable instance of BiologicallyDerivedProduct_Collection
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public BiologicallyDerivedProduct_Collection build() {
      return new ImmutableBiologicallyDerivedProduct_Collection(collector, id, modifierExtension, extension, source, collectedDateTime, collectedPeriod);
    }

    private boolean collectorIsSet() {
      return (optBits & OPT_BIT_COLLECTOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean collectedDateTimeIsSet() {
      return (optBits & OPT_BIT_COLLECTED_DATE_TIME) != 0;
    }

    private boolean collectedPeriodIsSet() {
      return (optBits & OPT_BIT_COLLECTED_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of BiologicallyDerivedProduct_Collection is strict, attribute is already set: ".concat(name));
    }
  }
}
