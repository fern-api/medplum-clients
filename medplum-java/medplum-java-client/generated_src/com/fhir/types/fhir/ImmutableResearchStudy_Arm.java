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
 * Immutable implementation of {@link ResearchStudy_Arm}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchStudy_Arm.builder()}.
 */
@Generated(from = "ResearchStudy_Arm", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchStudy_Arm implements ResearchStudy_Arm {
  private final @Nullable String description;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept type;
  private final @Nullable String name;

  private ImmutableResearchStudy_Arm(
      @Nullable String description,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept type,
      @Nullable String name) {
    this.description = description;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.type = type;
    this.name = name;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy_Arm#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableResearchStudy_Arm(newValue, this.modifierExtension, this.id, this.extension, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy_Arm#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableResearchStudy_Arm(value, this.modifierExtension, this.id, this.extension, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy_Arm#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchStudy_Arm(this.description, newValue, this.id, this.extension, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy_Arm#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy_Arm withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchStudy_Arm(this.description, value, this.id, this.extension, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy_Arm#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, newValue, this.extension, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy_Arm#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, value, this.extension, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy_Arm#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, this.id, newValue, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy_Arm#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy_Arm withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, this.id, value, this.type, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy_Arm#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, this.id, this.extension, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy_Arm#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy_Arm withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, this.id, this.extension, value, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy_Arm#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, this.id, this.extension, this.type, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy_Arm#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy_Arm withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableResearchStudy_Arm(this.description, this.modifierExtension, this.id, this.extension, this.type, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchStudy_Arm} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchStudy_Arm
        && equalTo((ImmutableResearchStudy_Arm) another);
  }

  private boolean equalTo(ImmutableResearchStudy_Arm another) {
    return Objects.equals(description, another.description)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code modifierExtension}, {@code id}, {@code extension}, {@code type}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchStudy_Arm} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ResearchStudy_Arm{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ResearchStudy_Arm", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ResearchStudy_Arm {
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableResearchStudy_Arm fromJson(Json json) {
    ImmutableResearchStudy_Arm.Builder builder = ImmutableResearchStudy_Arm.builder();
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    return (ImmutableResearchStudy_Arm) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ResearchStudy_Arm} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ResearchStudy_Arm instance
   */
  public static ResearchStudy_Arm copyOf(ResearchStudy_Arm instance) {
    if (instance instanceof ImmutableResearchStudy_Arm) {
      return (ImmutableResearchStudy_Arm) instance;
    }
    return ImmutableResearchStudy_Arm.builder()
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .type(instance.type())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchStudy_Arm ResearchStudy_Arm}.
   * <pre>
   * ImmutableResearchStudy_Arm.builder()
   *    .description(String) // optional {@link ResearchStudy_Arm#description() description}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ResearchStudy_Arm#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ResearchStudy_Arm#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ResearchStudy_Arm#extension() extension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link ResearchStudy_Arm#type() type}
   *    .name(String) // optional {@link ResearchStudy_Arm#name() name}
   *    .build();
   * </pre>
   * @return A new ResearchStudy_Arm builder
   */
  public static ImmutableResearchStudy_Arm.Builder builder() {
    return new ImmutableResearchStudy_Arm.Builder();
  }

  /**
   * Builds instances of type {@link ResearchStudy_Arm ResearchStudy_Arm}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ResearchStudy_Arm", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private long optBits;

    private @Nullable String description;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;
    private @Nullable String name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchStudy_Arm#description() description} to description.
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
     * Initializes the optional value {@link ResearchStudy_Arm#description() description} to description.
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
     * Initializes the optional value {@link ResearchStudy_Arm#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchStudy_Arm#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchStudy_Arm#id() id} to id.
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
     * Initializes the optional value {@link ResearchStudy_Arm#id() id} to id.
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
     * Initializes the optional value {@link ResearchStudy_Arm#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchStudy_Arm#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchStudy_Arm#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy_Arm#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy_Arm#name() name} to name.
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
     * Initializes the optional value {@link ResearchStudy_Arm#name() name} to name.
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
     * Builds a new {@link ResearchStudy_Arm ResearchStudy_Arm}.
     * @return An immutable instance of ResearchStudy_Arm
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ResearchStudy_Arm build() {
      return new ImmutableResearchStudy_Arm(description, modifierExtension, id, extension, type, name);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
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

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ResearchStudy_Arm is strict, attribute is already set: ".concat(name));
    }
  }
}
