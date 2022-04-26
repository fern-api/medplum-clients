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
 * Immutable implementation of {@link NamingSystem_UniqueId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNamingSystem_UniqueId.builder()}.
 */
@Generated(from = "NamingSystem_UniqueId", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNamingSystem_UniqueId implements NamingSystem_UniqueId {
  private final @Nullable Boolean preferred;
  private final @Nullable Period period;
  private final @Nullable String comment;
  private final @Nullable String value;
  private final @Nullable Namingsystem_UniqueidType type;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableNamingSystem_UniqueId(
      @Nullable Boolean preferred,
      @Nullable Period period,
      @Nullable String comment,
      @Nullable String value,
      @Nullable Namingsystem_UniqueidType type,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.preferred = preferred;
    this.period = period;
    this.comment = comment;
    this.value = value;
    this.type = type;
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code preferred} attribute
   */
  @JsonProperty("preferred")
  @Override
  public Optional<Boolean> preferred() {
    return Optional.ofNullable(preferred);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Namingsystem_UniqueidType> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#preferred() preferred} attribute.
   * @param value The value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withPreferred(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.preferred, newValue)) return this;
    return new ImmutableNamingSystem_UniqueId(
        newValue,
        this.period,
        this.comment,
        this.value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#preferred() preferred} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withPreferred(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.preferred, value)) return this;
    return new ImmutableNamingSystem_UniqueId(
        value,
        this.period,
        this.comment,
        this.value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        newValue,
        this.comment,
        this.value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem_UniqueId withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        value,
        this.comment,
        this.value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        newValue,
        this.value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        value,
        this.value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        newValue,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        value,
        this.type,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withType(Namingsystem_UniqueidType value) {
    @Nullable Namingsystem_UniqueidType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        newValue,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem_UniqueId withType(Optional<? extends Namingsystem_UniqueidType> optional) {
    @Nullable Namingsystem_UniqueidType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        value,
        this.extension,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        this.type,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem_UniqueId withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        this.type,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        this.type,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        this.type,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem_UniqueId#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem_UniqueId withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        this.type,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem_UniqueId#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem_UniqueId withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNamingSystem_UniqueId(
        this.preferred,
        this.period,
        this.comment,
        this.value,
        this.type,
        this.extension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNamingSystem_UniqueId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNamingSystem_UniqueId
        && equalTo((ImmutableNamingSystem_UniqueId) another);
  }

  private boolean equalTo(ImmutableNamingSystem_UniqueId another) {
    return Objects.equals(preferred, another.preferred)
        && Objects.equals(period, another.period)
        && Objects.equals(comment, another.comment)
        && Objects.equals(value, another.value)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code preferred}, {@code period}, {@code comment}, {@code value}, {@code type}, {@code extension}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(preferred);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code NamingSystem_UniqueId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NamingSystem_UniqueId{");
    if (preferred != null) {
      builder.append("preferred=").append(preferred);
    }
    if (period != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (comment != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (value != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (type != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NamingSystem_UniqueId", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NamingSystem_UniqueId {
    @Nullable Optional<Boolean> preferred = Optional.empty();
    boolean preferredIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<Namingsystem_UniqueidType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("preferred")
    public void setPreferred(Optional<Boolean> preferred) {
      this.preferred = preferred;
      this.preferredIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Namingsystem_UniqueidType> type) {
      this.type = type;
      this.typeIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Boolean> preferred() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Namingsystem_UniqueidType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNamingSystem_UniqueId fromJson(Json json) {
    ImmutableNamingSystem_UniqueId.Builder builder = ImmutableNamingSystem_UniqueId.builder();
    if (json.preferredIsSet) {
      builder.preferred(json.preferred);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableNamingSystem_UniqueId) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NamingSystem_UniqueId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NamingSystem_UniqueId instance
   */
  public static NamingSystem_UniqueId copyOf(NamingSystem_UniqueId instance) {
    if (instance instanceof ImmutableNamingSystem_UniqueId) {
      return (ImmutableNamingSystem_UniqueId) instance;
    }
    return ImmutableNamingSystem_UniqueId.builder()
        .preferred(instance.preferred())
        .period(instance.period())
        .comment(instance.comment())
        .value(instance.value())
        .type(instance.type())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link NamingSystem_UniqueId NamingSystem_UniqueId}.
   * <pre>
   * ImmutableNamingSystem_UniqueId.builder()
   *    .preferred(Boolean) // optional {@link NamingSystem_UniqueId#preferred() preferred}
   *    .period(com.fhir.types.fhir.Period) // optional {@link NamingSystem_UniqueId#period() period}
   *    .comment(String) // optional {@link NamingSystem_UniqueId#comment() comment}
   *    .value(String) // optional {@link NamingSystem_UniqueId#value() value}
   *    .type(Namingsystem_UniqueidType) // optional {@link NamingSystem_UniqueId#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NamingSystem_UniqueId#extension() extension}
   *    .id(String) // optional {@link NamingSystem_UniqueId#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NamingSystem_UniqueId#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new NamingSystem_UniqueId builder
   */
  public static ImmutableNamingSystem_UniqueId.Builder builder() {
    return new ImmutableNamingSystem_UniqueId.Builder();
  }

  /**
   * Builds instances of type {@link NamingSystem_UniqueId NamingSystem_UniqueId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NamingSystem_UniqueId", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PREFERRED = 0x1L;
    private static final long OPT_BIT_PERIOD = 0x2L;
    private static final long OPT_BIT_COMMENT = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable Boolean preferred;
    private @Nullable Period period;
    private @Nullable String comment;
    private @Nullable String value;
    private @Nullable Namingsystem_UniqueidType type;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for chained invocation
     */
    public final Builder preferred(boolean preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred;
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preferred")
    public final Builder preferred(Optional<Boolean> preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred.orElse(null);
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Namingsystem_UniqueidType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Namingsystem_UniqueidType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem_UniqueId#extension() extension} to extension.
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
     * Initializes the optional value {@link NamingSystem_UniqueId#extension() extension} to extension.
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
     * Initializes the optional value {@link NamingSystem_UniqueId#id() id} to id.
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
     * Initializes the optional value {@link NamingSystem_UniqueId#id() id} to id.
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
     * Initializes the optional value {@link NamingSystem_UniqueId#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NamingSystem_UniqueId#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link NamingSystem_UniqueId NamingSystem_UniqueId}.
     * @return An immutable instance of NamingSystem_UniqueId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NamingSystem_UniqueId build() {
      return new ImmutableNamingSystem_UniqueId(preferred, period, comment, value, type, extension, id, modifierExtension);
    }

    private boolean preferredIsSet() {
      return (optBits & OPT_BIT_PREFERRED) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NamingSystem_UniqueId is strict, attribute is already set: ".concat(name));
    }
  }
}
