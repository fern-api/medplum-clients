package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ConceptMap_DependsOn}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_DependsOn.builder()}.
 */
@Generated(from = "ConceptMap_DependsOn", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_DependsOn implements ConceptMap_DependsOn {
  private final @Nullable Canonical system;
  private final @Nullable String value;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String display;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri property;

  private ImmutableConceptMap_DependsOn(
      @Nullable Canonical system,
      @Nullable String value,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String display,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri property) {
    this.system = system;
    this.value = value;
    this.extension = extension;
    this.id = id;
    this.display = display;
    this.modifierExtension = modifierExtension;
    this.property = property;
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Canonical> system() {
    return Optional.ofNullable(system);
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
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public Optional<String> display() {
    return Optional.ofNullable(display);
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
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<Uri> property() {
    return Optional.ofNullable(property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withSystem(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableConceptMap_DependsOn(
        newValue,
        this.value,
        this.extension,
        this.id,
        this.display,
        this.modifierExtension,
        this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_DependsOn withSystem(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableConceptMap_DependsOn(value, this.value, this.extension, this.id, this.display, this.modifierExtension, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableConceptMap_DependsOn(
        this.system,
        newValue,
        this.extension,
        this.id,
        this.display,
        this.modifierExtension,
        this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableConceptMap_DependsOn(
        this.system,
        value,
        this.extension,
        this.id,
        this.display,
        this.modifierExtension,
        this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_DependsOn(this.system, this.value, newValue, this.id, this.display, this.modifierExtension, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_DependsOn withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_DependsOn(this.system, this.value, value, this.id, this.display, this.modifierExtension, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_DependsOn(
        this.system,
        this.value,
        this.extension,
        newValue,
        this.display,
        this.modifierExtension,
        this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_DependsOn(
        this.system,
        this.value,
        this.extension,
        value,
        this.display,
        this.modifierExtension,
        this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableConceptMap_DependsOn(
        this.system,
        this.value,
        this.extension,
        this.id,
        newValue,
        this.modifierExtension,
        this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableConceptMap_DependsOn(this.system, this.value, this.extension, this.id, value, this.modifierExtension, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_DependsOn(this.system, this.value, this.extension, this.id, this.display, newValue, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_DependsOn withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_DependsOn(this.system, this.value, this.extension, this.id, this.display, value, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_DependsOn#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_DependsOn withProperty(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableConceptMap_DependsOn(
        this.system,
        this.value,
        this.extension,
        this.id,
        this.display,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_DependsOn#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_DependsOn withProperty(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableConceptMap_DependsOn(this.system, this.value, this.extension, this.id, this.display, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_DependsOn} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_DependsOn
        && equalTo((ImmutableConceptMap_DependsOn) another);
  }

  private boolean equalTo(ImmutableConceptMap_DependsOn another) {
    return Objects.equals(system, another.system)
        && Objects.equals(value, another.value)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(display, another.display)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(property, another.property);
  }

  /**
   * Computes a hash code from attributes: {@code system}, {@code value}, {@code extension}, {@code id}, {@code display}, {@code modifierExtension}, {@code property}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(property);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_DependsOn} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ConceptMap_DependsOn{");
    if (system != null) {
      builder.append("system=").append(system);
    }
    if (value != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (display != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (property != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("property=").append(property);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ConceptMap_DependsOn", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConceptMap_DependsOn {
    @Nullable Optional<Canonical> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> property = Optional.empty();
    boolean propertyIsSet;
    @JsonProperty("system")
    public void setSystem(Optional<Canonical> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
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
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<Uri> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @Override
    public Optional<Canonical> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> property() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConceptMap_DependsOn fromJson(Json json) {
    ImmutableConceptMap_DependsOn.Builder builder = ImmutableConceptMap_DependsOn.builder();
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    return (ImmutableConceptMap_DependsOn) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_DependsOn} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_DependsOn instance
   */
  public static ConceptMap_DependsOn copyOf(ConceptMap_DependsOn instance) {
    if (instance instanceof ImmutableConceptMap_DependsOn) {
      return (ImmutableConceptMap_DependsOn) instance;
    }
    return ImmutableConceptMap_DependsOn.builder()
        .system(instance.system())
        .value(instance.value())
        .extension(instance.extension())
        .id(instance.id())
        .display(instance.display())
        .modifierExtension(instance.modifierExtension())
        .property(instance.property())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_DependsOn ConceptMap_DependsOn}.
   * <pre>
   * ImmutableConceptMap_DependsOn.builder()
   *    .system(com.medplum.types.fhir.Canonical) // optional {@link ConceptMap_DependsOn#system() system}
   *    .value(String) // optional {@link ConceptMap_DependsOn#value() value}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_DependsOn#extension() extension}
   *    .id(String) // optional {@link ConceptMap_DependsOn#id() id}
   *    .display(String) // optional {@link ConceptMap_DependsOn#display() display}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_DependsOn#modifierExtension() modifierExtension}
   *    .property(com.medplum.types.fhir.Uri) // optional {@link ConceptMap_DependsOn#property() property}
   *    .build();
   * </pre>
   * @return A new ConceptMap_DependsOn builder
   */
  public static ImmutableConceptMap_DependsOn.Builder builder() {
    return new ImmutableConceptMap_DependsOn.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_DependsOn ConceptMap_DependsOn}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ConceptMap_DependsOn", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SYSTEM = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_DISPLAY = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_PROPERTY = 0x40L;
    private long optBits;

    private @Nullable Canonical system;
    private @Nullable String value;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String display;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri property;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_DependsOn#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(Canonical system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_DependsOn#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends Canonical> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_DependsOn#value() value} to value.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#value() value} to value.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_DependsOn#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("display")
    public final Builder display(Optional<String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_DependsOn#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(Uri property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_DependsOn#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends Uri> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Builds a new {@link ConceptMap_DependsOn ConceptMap_DependsOn}.
     * @return An immutable instance of ConceptMap_DependsOn
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ConceptMap_DependsOn build() {
      return new ImmutableConceptMap_DependsOn(system, value, extension, id, display, modifierExtension, property);
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ConceptMap_DependsOn is strict, attribute is already set: ".concat(name));
    }
  }
}
