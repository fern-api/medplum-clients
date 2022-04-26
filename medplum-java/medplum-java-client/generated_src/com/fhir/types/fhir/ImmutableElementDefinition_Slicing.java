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
 * Immutable implementation of {@link ElementDefinition_Slicing}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Slicing.builder()}.
 */
@Generated(from = "ElementDefinition_Slicing", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Slicing implements ElementDefinition_Slicing {
  private final @Nullable String description;
  private final @Nullable Boolean ordered;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ElementDefinition_Discriminator> discriminator;
  private final @Nullable Elementdefinition_SlicingRules rules;

  private ImmutableElementDefinition_Slicing(
      @Nullable String description,
      @Nullable Boolean ordered,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ElementDefinition_Discriminator> discriminator,
      @Nullable Elementdefinition_SlicingRules rules) {
    this.description = description;
    this.ordered = ordered;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.discriminator = discriminator;
    this.rules = rules;
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
   * @return The value of the {@code ordered} attribute
   */
  @JsonProperty("ordered")
  @Override
  public Optional<Boolean> ordered() {
    return Optional.ofNullable(ordered);
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
   * @return The value of the {@code discriminator} attribute
   */
  @JsonProperty("discriminator")
  @Override
  public Optional<List<ElementDefinition_Discriminator>> discriminator() {
    return Optional.ofNullable(discriminator);
  }

  /**
   * @return The value of the {@code rules} attribute
   */
  @JsonProperty("rules")
  @Override
  public Optional<Elementdefinition_SlicingRules> rules() {
    return Optional.ofNullable(rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableElementDefinition_Slicing(
        newValue,
        this.ordered,
        this.id,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableElementDefinition_Slicing(
        value,
        this.ordered,
        this.id,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#ordered() ordered} attribute.
   * @param value The value for ordered
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withOrdered(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.ordered, newValue)) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#ordered() ordered} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ordered
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withOrdered(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.ordered, value)) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        value,
        this.id,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        newValue,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        value,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        newValue,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Slicing withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        value,
        this.modifierExtension,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        this.extension,
        newValue,
        this.discriminator,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Slicing withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Slicing(this.description, this.ordered, this.id, this.extension, value, this.discriminator, this.rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#discriminator() discriminator} attribute.
   * @param value The value for discriminator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withDiscriminator(List<ElementDefinition_Discriminator> value) {
    @Nullable List<ElementDefinition_Discriminator> newValue = Objects.requireNonNull(value, "discriminator");
    if (this.discriminator == newValue) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#discriminator() discriminator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for discriminator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Slicing withDiscriminator(Optional<? extends List<ElementDefinition_Discriminator>> optional) {
    @Nullable List<ElementDefinition_Discriminator> value = optional.orElse(null);
    if (this.discriminator == value) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.rules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Slicing#rules() rules} attribute.
   * @param value The value for rules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Slicing withRules(Elementdefinition_SlicingRules value) {
    @Nullable Elementdefinition_SlicingRules newValue = Objects.requireNonNull(value, "rules");
    if (this.rules == newValue) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Slicing#rules() rules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Slicing withRules(Optional<? extends Elementdefinition_SlicingRules> optional) {
    @Nullable Elementdefinition_SlicingRules value = optional.orElse(null);
    if (this.rules == value) return this;
    return new ImmutableElementDefinition_Slicing(
        this.description,
        this.ordered,
        this.id,
        this.extension,
        this.modifierExtension,
        this.discriminator,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Slicing} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Slicing
        && equalTo((ImmutableElementDefinition_Slicing) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Slicing another) {
    return Objects.equals(description, another.description)
        && Objects.equals(ordered, another.ordered)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(discriminator, another.discriminator)
        && Objects.equals(rules, another.rules);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code ordered}, {@code id}, {@code extension}, {@code modifierExtension}, {@code discriminator}, {@code rules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(ordered);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(discriminator);
    h += (h << 5) + Objects.hashCode(rules);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Slicing} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ElementDefinition_Slicing{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (ordered != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("ordered=").append(ordered);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (discriminator != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("discriminator=").append(discriminator);
    }
    if (rules != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("rules=").append(rules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ElementDefinition_Slicing", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ElementDefinition_Slicing {
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Boolean> ordered = Optional.empty();
    boolean orderedIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ElementDefinition_Discriminator>> discriminator = Optional.empty();
    boolean discriminatorIsSet;
    @Nullable Optional<Elementdefinition_SlicingRules> rules = Optional.empty();
    boolean rulesIsSet;
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("ordered")
    public void setOrdered(Optional<Boolean> ordered) {
      this.ordered = ordered;
      this.orderedIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("discriminator")
    public void setDiscriminator(Optional<List<ElementDefinition_Discriminator>> discriminator) {
      this.discriminator = discriminator;
      this.discriminatorIsSet = true;
    }
    @JsonProperty("rules")
    public void setRules(Optional<Elementdefinition_SlicingRules> rules) {
      this.rules = rules;
      this.rulesIsSet = true;
    }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> ordered() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ElementDefinition_Discriminator>> discriminator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Elementdefinition_SlicingRules> rules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Slicing fromJson(Json json) {
    ImmutableElementDefinition_Slicing.Builder builder = ImmutableElementDefinition_Slicing.builder();
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.orderedIsSet) {
      builder.ordered(json.ordered);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.discriminatorIsSet) {
      builder.discriminator(json.discriminator);
    }
    if (json.rulesIsSet) {
      builder.rules(json.rules);
    }
    return (ImmutableElementDefinition_Slicing) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Slicing} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Slicing instance
   */
  public static ElementDefinition_Slicing copyOf(ElementDefinition_Slicing instance) {
    if (instance instanceof ImmutableElementDefinition_Slicing) {
      return (ImmutableElementDefinition_Slicing) instance;
    }
    return ImmutableElementDefinition_Slicing.builder()
        .description(instance.description())
        .ordered(instance.ordered())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .discriminator(instance.discriminator())
        .rules(instance.rules())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Slicing ElementDefinition_Slicing}.
   * <pre>
   * ImmutableElementDefinition_Slicing.builder()
   *    .description(String) // optional {@link ElementDefinition_Slicing#description() description}
   *    .ordered(Boolean) // optional {@link ElementDefinition_Slicing#ordered() ordered}
   *    .id(String) // optional {@link ElementDefinition_Slicing#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Slicing#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Slicing#modifierExtension() modifierExtension}
   *    .discriminator(List&amp;lt;com.fhir.types.fhir.ElementDefinition_Discriminator&amp;gt;) // optional {@link ElementDefinition_Slicing#discriminator() discriminator}
   *    .rules(Elementdefinition_SlicingRules) // optional {@link ElementDefinition_Slicing#rules() rules}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Slicing builder
   */
  public static ImmutableElementDefinition_Slicing.Builder builder() {
    return new ImmutableElementDefinition_Slicing.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Slicing ElementDefinition_Slicing}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ElementDefinition_Slicing", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_ORDERED = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_DISCRIMINATOR = 0x20L;
    private static final long OPT_BIT_RULES = 0x40L;
    private long optBits;

    private @Nullable String description;
    private @Nullable Boolean ordered;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ElementDefinition_Discriminator> discriminator;
    private @Nullable Elementdefinition_SlicingRules rules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Slicing#description() description} to description.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#description() description} to description.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#ordered() ordered} to ordered.
     * @param ordered The value for ordered
     * @return {@code this} builder for chained invocation
     */
    public final Builder ordered(boolean ordered) {
      checkNotIsSet(orderedIsSet(), "ordered");
      this.ordered = ordered;
      optBits |= OPT_BIT_ORDERED;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Slicing#ordered() ordered} to ordered.
     * @param ordered The value for ordered
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ordered")
    public final Builder ordered(Optional<Boolean> ordered) {
      checkNotIsSet(orderedIsSet(), "ordered");
      this.ordered = ordered.orElse(null);
      optBits |= OPT_BIT_ORDERED;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Slicing#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Slicing#discriminator() discriminator} to discriminator.
     * @param discriminator The value for discriminator
     * @return {@code this} builder for chained invocation
     */
    public final Builder discriminator(List<ElementDefinition_Discriminator> discriminator) {
      checkNotIsSet(discriminatorIsSet(), "discriminator");
      this.discriminator = Objects.requireNonNull(discriminator, "discriminator");
      optBits |= OPT_BIT_DISCRIMINATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Slicing#discriminator() discriminator} to discriminator.
     * @param discriminator The value for discriminator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("discriminator")
    public final Builder discriminator(Optional<? extends List<ElementDefinition_Discriminator>> discriminator) {
      checkNotIsSet(discriminatorIsSet(), "discriminator");
      this.discriminator = discriminator.orElse(null);
      optBits |= OPT_BIT_DISCRIMINATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Slicing#rules() rules} to rules.
     * @param rules The value for rules
     * @return {@code this} builder for chained invocation
     */
    public final Builder rules(Elementdefinition_SlicingRules rules) {
      checkNotIsSet(rulesIsSet(), "rules");
      this.rules = Objects.requireNonNull(rules, "rules");
      optBits |= OPT_BIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Slicing#rules() rules} to rules.
     * @param rules The value for rules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rules")
    public final Builder rules(Optional<? extends Elementdefinition_SlicingRules> rules) {
      checkNotIsSet(rulesIsSet(), "rules");
      this.rules = rules.orElse(null);
      optBits |= OPT_BIT_RULES;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Slicing ElementDefinition_Slicing}.
     * @return An immutable instance of ElementDefinition_Slicing
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ElementDefinition_Slicing build() {
      return new ImmutableElementDefinition_Slicing(description, ordered, id, extension, modifierExtension, discriminator, rules);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean orderedIsSet() {
      return (optBits & OPT_BIT_ORDERED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean discriminatorIsSet() {
      return (optBits & OPT_BIT_DISCRIMINATOR) != 0;
    }

    private boolean rulesIsSet() {
      return (optBits & OPT_BIT_RULES) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ElementDefinition_Slicing is strict, attribute is already set: ".concat(name));
    }
  }
}
