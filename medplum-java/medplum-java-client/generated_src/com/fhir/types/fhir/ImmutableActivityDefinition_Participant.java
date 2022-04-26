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
 * Immutable implementation of {@link ActivityDefinition_Participant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActivityDefinition_Participant.builder()}.
 */
@Generated(from = "ActivityDefinition_Participant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableActivityDefinition_Participant
    implements ActivityDefinition_Participant {
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept role;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code type;

  private ImmutableActivityDefinition_Participant(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept role,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code type) {
    this.extension = extension;
    this.role = role;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.type = type;
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
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<CodeableConcept> role() {
    return Optional.ofNullable(role);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Code> type() {
    return Optional.ofNullable(type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_Participant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_Participant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableActivityDefinition_Participant(newValue, this.role, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_Participant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition_Participant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableActivityDefinition_Participant(value, this.role, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_Participant#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_Participant withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, newValue, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_Participant#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition_Participant withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, value, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_Participant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_Participant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, this.role, newValue, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_Participant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_Participant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, this.role, value, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_Participant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_Participant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, this.role, this.id, newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_Participant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition_Participant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, this.role, this.id, value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_Participant#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_Participant withType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, this.role, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_Participant#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition_Participant withType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableActivityDefinition_Participant(this.extension, this.role, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActivityDefinition_Participant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActivityDefinition_Participant
        && equalTo((ImmutableActivityDefinition_Participant) another);
  }

  private boolean equalTo(ImmutableActivityDefinition_Participant another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(role, another.role)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code role}, {@code id}, {@code modifierExtension}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code ActivityDefinition_Participant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ActivityDefinition_Participant{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (role != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ActivityDefinition_Participant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ActivityDefinition_Participant {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(Optional<CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
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
    @JsonProperty("type")
    public void setType(Optional<Code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableActivityDefinition_Participant fromJson(Json json) {
    ImmutableActivityDefinition_Participant.Builder builder = ImmutableActivityDefinition_Participant.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableActivityDefinition_Participant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ActivityDefinition_Participant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ActivityDefinition_Participant instance
   */
  public static ActivityDefinition_Participant copyOf(ActivityDefinition_Participant instance) {
    if (instance instanceof ImmutableActivityDefinition_Participant) {
      return (ImmutableActivityDefinition_Participant) instance;
    }
    return ImmutableActivityDefinition_Participant.builder()
        .extension(instance.extension())
        .role(instance.role())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link ActivityDefinition_Participant ActivityDefinition_Participant}.
   * <pre>
   * ImmutableActivityDefinition_Participant.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition_Participant#extension() extension}
   *    .role(com.fhir.types.fhir.CodeableConcept) // optional {@link ActivityDefinition_Participant#role() role}
   *    .id(String) // optional {@link ActivityDefinition_Participant#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition_Participant#modifierExtension() modifierExtension}
   *    .type(com.fhir.types.fhir.Code) // optional {@link ActivityDefinition_Participant#type() type}
   *    .build();
   * </pre>
   * @return A new ActivityDefinition_Participant builder
   */
  public static ImmutableActivityDefinition_Participant.Builder builder() {
    return new ImmutableActivityDefinition_Participant.Builder();
  }

  /**
   * Builds instances of type {@link ActivityDefinition_Participant ActivityDefinition_Participant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ActivityDefinition_Participant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ROLE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept role;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ActivityDefinition_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link ActivityDefinition_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link ActivityDefinition_Participant#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition_Participant#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition_Participant#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition_Participant#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition_Participant#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition_Participant#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link ActivityDefinition_Participant ActivityDefinition_Participant}.
     * @return An immutable instance of ActivityDefinition_Participant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ActivityDefinition_Participant build() {
      return new ImmutableActivityDefinition_Participant(extension, role, id, modifierExtension, type);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ActivityDefinition_Participant is strict, attribute is already set: ".concat(name));
    }
  }
}
