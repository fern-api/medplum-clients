package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ValueSet_Compose}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Compose.builder()}.
 */
@Generated(from = "ValueSet_Compose", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Compose implements ValueSet_Compose {
  private final @Nullable List<ValueSet_Include> exclude;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean inactive;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final List<ValueSet_Include> include;
  private final @Nullable Date lockedDate;

  private ImmutableValueSet_Compose(
      @Nullable List<ValueSet_Include> exclude,
      @Nullable List<Extension> extension,
      @Nullable Boolean inactive,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      List<ValueSet_Include> include,
      @Nullable Date lockedDate) {
    this.exclude = exclude;
    this.extension = extension;
    this.inactive = inactive;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.include = include;
    this.lockedDate = lockedDate;
  }

  /**
   * @return The value of the {@code exclude} attribute
   */
  @JsonProperty("exclude")
  @Override
  public Optional<List<ValueSet_Include>> exclude() {
    return Optional.ofNullable(exclude);
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
   * @return The value of the {@code inactive} attribute
   */
  @JsonProperty("inactive")
  @Override
  public Optional<Boolean> inactive() {
    return Optional.ofNullable(inactive);
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
   * @return The value of the {@code include} attribute
   */
  @JsonProperty("include")
  @Override
  public List<ValueSet_Include> include() {
    return include;
  }

  /**
   * @return The value of the {@code lockedDate} attribute
   */
  @JsonProperty("lockedDate")
  @Override
  public Optional<Date> lockedDate() {
    return Optional.ofNullable(lockedDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#exclude() exclude} attribute.
   * @param value The value for exclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withExclude(List<ValueSet_Include> value) {
    @Nullable List<ValueSet_Include> newValue = Objects.requireNonNull(value, "exclude");
    if (this.exclude == newValue) return this;
    return new ImmutableValueSet_Compose(
        newValue,
        this.extension,
        this.inactive,
        this.id,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#exclude() exclude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exclude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withExclude(Optional<? extends List<ValueSet_Include>> optional) {
    @Nullable List<ValueSet_Include> value = optional.orElse(null);
    if (this.exclude == value) return this;
    return new ImmutableValueSet_Compose(
        value,
        this.extension,
        this.inactive,
        this.id,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        newValue,
        this.inactive,
        this.id,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        value,
        this.inactive,
        this.id,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#inactive() inactive} attribute.
   * @param value The value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInactive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.inactive, newValue)) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#inactive() inactive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInactive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.inactive, value)) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        this.inactive,
        newValue,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        this.inactive,
        value,
        this.modifierExtension,
        this.include,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Compose(this.exclude, this.extension, this.inactive, this.id, newValue, this.include, this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Compose(this.exclude, this.extension, this.inactive, this.id, value, this.include, this.lockedDate);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ValueSet_Compose#include() include}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInclude(ValueSet_Include... elements) {
    List<ValueSet_Include> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        this.inactive,
        this.id,
        this.modifierExtension,
        newValue,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ValueSet_Compose#include() include}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of include elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withInclude(Iterable<? extends ValueSet_Include> elements) {
    if (this.include == elements) return this;
    List<ValueSet_Include> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        this.inactive,
        this.id,
        this.modifierExtension,
        newValue,
        this.lockedDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Compose#lockedDate() lockedDate} attribute.
   * @param value The value for lockedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Compose withLockedDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lockedDate");
    if (this.lockedDate == newValue) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        this.inactive,
        this.id,
        this.modifierExtension,
        this.include,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Compose#lockedDate() lockedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lockedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Compose withLockedDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lockedDate == value) return this;
    return new ImmutableValueSet_Compose(
        this.exclude,
        this.extension,
        this.inactive,
        this.id,
        this.modifierExtension,
        this.include,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Compose} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Compose
        && equalTo((ImmutableValueSet_Compose) another);
  }

  private boolean equalTo(ImmutableValueSet_Compose another) {
    return Objects.equals(exclude, another.exclude)
        && Objects.equals(extension, another.extension)
        && Objects.equals(inactive, another.inactive)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && include.equals(another.include)
        && Objects.equals(lockedDate, another.lockedDate);
  }

  /**
   * Computes a hash code from attributes: {@code exclude}, {@code extension}, {@code inactive}, {@code id}, {@code modifierExtension}, {@code include}, {@code lockedDate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(exclude);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(inactive);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + include.hashCode();
    h += (h << 5) + Objects.hashCode(lockedDate);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Compose} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Compose{");
    if (exclude != null) {
      builder.append("exclude=").append(exclude);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (inactive != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("inactive=").append(inactive);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("include=").append(include);
    if (lockedDate != null) {
      builder.append(", ");
      builder.append("lockedDate=").append(lockedDate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Compose", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Compose {
    @Nullable Optional<List<ValueSet_Include>> exclude = Optional.empty();
    boolean excludeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> inactive = Optional.empty();
    boolean inactiveIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<ValueSet_Include> include = Collections.emptyList();
    @Nullable Optional<Date> lockedDate = Optional.empty();
    boolean lockedDateIsSet;
    @JsonProperty("exclude")
    public void setExclude(Optional<List<ValueSet_Include>> exclude) {
      this.exclude = exclude;
      this.excludeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("inactive")
    public void setInactive(Optional<Boolean> inactive) {
      this.inactive = inactive;
      this.inactiveIsSet = true;
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
    @JsonProperty("include")
    public void setInclude(List<ValueSet_Include> include) {
      this.include = include;
    }
    @JsonProperty("lockedDate")
    public void setLockedDate(Optional<Date> lockedDate) {
      this.lockedDate = lockedDate;
      this.lockedDateIsSet = true;
    }
    @Override
    public Optional<List<ValueSet_Include>> exclude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> inactive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<ValueSet_Include> include() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lockedDate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Compose fromJson(Json json) {
    ImmutableValueSet_Compose.Builder builder = ImmutableValueSet_Compose.builder();
    if (json.excludeIsSet) {
      builder.exclude(json.exclude);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.inactiveIsSet) {
      builder.inactive(json.inactive);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.include != null) {
      builder.addAllInclude(json.include);
    }
    if (json.lockedDateIsSet) {
      builder.lockedDate(json.lockedDate);
    }
    return (ImmutableValueSet_Compose) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Compose} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Compose instance
   */
  public static ValueSet_Compose copyOf(ValueSet_Compose instance) {
    if (instance instanceof ImmutableValueSet_Compose) {
      return (ImmutableValueSet_Compose) instance;
    }
    return ImmutableValueSet_Compose.builder()
        .exclude(instance.exclude())
        .extension(instance.extension())
        .inactive(instance.inactive())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .addAllInclude(instance.include())
        .lockedDate(instance.lockedDate())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Compose ValueSet_Compose}.
   * <pre>
   * ImmutableValueSet_Compose.builder()
   *    .exclude(List&amp;lt;com.fhir.types.fhir.ValueSet_Include&amp;gt;) // optional {@link ValueSet_Compose#exclude() exclude}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Compose#extension() extension}
   *    .inactive(Boolean) // optional {@link ValueSet_Compose#inactive() inactive}
   *    .id(String) // optional {@link ValueSet_Compose#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Compose#modifierExtension() modifierExtension}
   *    .addInclude|addAllInclude(com.fhir.types.fhir.ValueSet_Include) // {@link ValueSet_Compose#include() include} elements
   *    .lockedDate(com.fhir.types.fhir.Date) // optional {@link ValueSet_Compose#lockedDate() lockedDate}
   *    .build();
   * </pre>
   * @return A new ValueSet_Compose builder
   */
  public static ImmutableValueSet_Compose.Builder builder() {
    return new ImmutableValueSet_Compose.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Compose ValueSet_Compose}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueSet_Compose", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXCLUDE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_INACTIVE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_LOCKED_DATE = 0x20L;
    private long optBits;

    private @Nullable List<ValueSet_Include> exclude;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean inactive;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private final List<ValueSet_Include> include = new ArrayList<ValueSet_Include>();
    private @Nullable Date lockedDate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#exclude() exclude} to exclude.
     * @param exclude The value for exclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder exclude(List<ValueSet_Include> exclude) {
      checkNotIsSet(excludeIsSet(), "exclude");
      this.exclude = Objects.requireNonNull(exclude, "exclude");
      optBits |= OPT_BIT_EXCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#exclude() exclude} to exclude.
     * @param exclude The value for exclude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exclude")
    public final Builder exclude(Optional<? extends List<ValueSet_Include>> exclude) {
      checkNotIsSet(excludeIsSet(), "exclude");
      this.exclude = exclude.orElse(null);
      optBits |= OPT_BIT_EXCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Compose#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Compose#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for chained invocation
     */
    public final Builder inactive(boolean inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive;
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inactive")
    public final Builder inactive(Optional<Boolean> inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive.orElse(null);
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Compose#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Compose#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Compose#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link ValueSet_Compose#include() include} list.
     * @param element A include element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(ValueSet_Include element) {
      this.include.add(Objects.requireNonNull(element, "include element"));
      return this;
    }

    /**
     * Adds elements to {@link ValueSet_Compose#include() include} list.
     * @param elements An array of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInclude(ValueSet_Include... elements) {
      for (ValueSet_Include element : elements) {
        this.include.add(Objects.requireNonNull(element, "include element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ValueSet_Compose#include() include} list.
     * @param elements An iterable of include elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInclude(Iterable<? extends ValueSet_Include> elements) {
      for (ValueSet_Include element : elements) {
        this.include.add(Objects.requireNonNull(element, "include element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lockedDate(Date lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = Objects.requireNonNull(lockedDate, "lockedDate");
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Compose#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lockedDate")
    public final Builder lockedDate(Optional<? extends Date> lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = lockedDate.orElse(null);
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Compose ValueSet_Compose}.
     * @return An immutable instance of ValueSet_Compose
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Compose build() {
      return new ImmutableValueSet_Compose(
          exclude,
          extension,
          inactive,
          id,
          modifierExtension,
          createUnmodifiableList(true, include),
          lockedDate);
    }

    private boolean excludeIsSet() {
      return (optBits & OPT_BIT_EXCLUDE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean inactiveIsSet() {
      return (optBits & OPT_BIT_INACTIVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean lockedDateIsSet() {
      return (optBits & OPT_BIT_LOCKED_DATE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Compose is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
