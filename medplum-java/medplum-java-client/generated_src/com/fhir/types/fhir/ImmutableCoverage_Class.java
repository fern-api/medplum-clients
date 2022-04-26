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
 * Immutable implementation of {@link Coverage_Class}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverage_Class.builder()}.
 */
@Generated(from = "Coverage_Class", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverage_Class implements Coverage_Class {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable String name;
  private final @Nullable String value;

  private ImmutableCoverage_Class(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable String name,
      @Nullable String value) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.type = type;
    this.extension = extension;
    this.name = name;
    this.value = value;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_Class#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverage_Class(newValue, this.id, this.type, this.extension, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_Class#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_Class withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverage_Class(value, this.id, this.type, this.extension, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_Class#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, newValue, this.type, this.extension, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_Class#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, value, this.type, this.extension, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coverage_Class#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverage_Class withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, newValue, this.extension, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_Class#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, this.type, newValue, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_Class#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_Class withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, this.type, value, this.name, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_Class#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, this.type, this.extension, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_Class#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, this.type, this.extension, value, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_Class#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, this.type, this.extension, this.name, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_Class#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_Class withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableCoverage_Class(this.modifierExtension, this.id, this.type, this.extension, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverage_Class} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverage_Class
        && equalTo((ImmutableCoverage_Class) another);
  }

  private boolean equalTo(ImmutableCoverage_Class another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && type.equals(another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name)
        && Objects.equals(value, another.value);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code type}, {@code extension}, {@code name}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code Coverage_Class} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Coverage_Class{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("type=").append(type);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (value != null) {
      builder.append(", ");
      builder.append("value=").append(value);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Coverage_Class", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Coverage_Class {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
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
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverage_Class fromJson(Json json) {
    ImmutableCoverage_Class.Builder builder = ((ImmutableCoverage_Class.Builder) ImmutableCoverage_Class.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    return (ImmutableCoverage_Class) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Coverage_Class} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coverage_Class instance
   */
  public static Coverage_Class copyOf(Coverage_Class instance) {
    if (instance instanceof ImmutableCoverage_Class) {
      return (ImmutableCoverage_Class) instance;
    }
    return ((ImmutableCoverage_Class.Builder) ImmutableCoverage_Class.builder())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .type(instance.type())
        .extension(instance.extension())
        .name(instance.name())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link Coverage_Class Coverage_Class}.
   * <pre>
   * ImmutableCoverage_Class.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Coverage_Class#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Coverage_Class#id() id}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link Coverage_Class#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Coverage_Class#extension() extension}
   *    .name(String) // optional {@link Coverage_Class#name() name}
   *    .value(String) // optional {@link Coverage_Class#value() value}
   *    .build();
   * </pre>
   * @return A new Coverage_Class builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableCoverage_Class.Builder();
  }

  /**
   * Builds instances of type {@link Coverage_Class Coverage_Class}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Coverage_Class", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_VALUE = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable String name;
    private @Nullable String value;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Coverage_Class#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Coverage_Class#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Coverage_Class#id() id} to id.
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
     * Initializes the optional value {@link Coverage_Class#id() id} to id.
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
     * Initializes the value for the {@link Coverage_Class#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_Class#extension() extension} to extension.
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
     * Initializes the optional value {@link Coverage_Class#extension() extension} to extension.
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
     * Initializes the optional value {@link Coverage_Class#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_Class#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_Class#value() value} to value.
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
     * Initializes the optional value {@link Coverage_Class#value() value} to value.
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
     * Builds a new {@link Coverage_Class Coverage_Class}.
     * @return An immutable instance of Coverage_Class
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Coverage_Class build() {
      checkRequiredAttributes();
      return new ImmutableCoverage_Class(modifierExtension, id, type, extension, name, value);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Coverage_Class is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build Coverage_Class, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Coverage_Class", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Coverage_Class#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "Coverage_Class", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Coverage_Class#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Coverage_Class#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Coverage_Class#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Coverage_Class#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Coverage_Class#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Coverage_Class#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Coverage_Class#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Coverage_Class#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Coverage_Class#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(String value);

    /**
     * Initializes the optional value {@link Coverage_Class#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(Optional<String> value);

    /**
     * Builds a new {@link Coverage_Class Coverage_Class}.
     * @return An immutable instance of Coverage_Class
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Coverage_Class build();
  }
}
