package com.medplum.types.fhir;

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
 * Immutable implementation of {@link CapabilityStatement_SupportedMessage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_SupportedMessage.builder()}.
 */
@Generated(from = "CapabilityStatement_SupportedMessage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_SupportedMessage
    implements CapabilityStatement_SupportedMessage {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Capabilitystatement_supportedmessageMode mode;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final Canonical definition;

  private ImmutableCapabilityStatement_SupportedMessage(
      @Nullable List<Extension> modifierExtension,
      @Nullable Capabilitystatement_supportedmessageMode mode,
      @Nullable String id,
      @Nullable List<Extension> extension,
      Canonical definition) {
    this.modifierExtension = modifierExtension;
    this.mode = mode;
    this.id = id;
    this.extension = extension;
    this.definition = definition;
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
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Capabilitystatement_supportedmessageMode> mode() {
    return Optional.ofNullable(mode);
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
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Canonical definition() {
    return definition;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SupportedMessage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(newValue, this.mode, this.id, this.extension, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SupportedMessage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(value, this.mode, this.id, this.extension, this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SupportedMessage#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SupportedMessage withMode(Capabilitystatement_supportedmessageMode value) {
    @Nullable Capabilitystatement_supportedmessageMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, newValue, this.id, this.extension, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SupportedMessage#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SupportedMessage withMode(Optional<? extends Capabilitystatement_supportedmessageMode> optional) {
    @Nullable Capabilitystatement_supportedmessageMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, value, this.id, this.extension, this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SupportedMessage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SupportedMessage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, this.mode, newValue, this.extension, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SupportedMessage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SupportedMessage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, this.mode, value, this.extension, this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SupportedMessage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SupportedMessage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, this.mode, this.id, newValue, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SupportedMessage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SupportedMessage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, this.mode, this.id, value, this.definition);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CapabilityStatement_SupportedMessage#definition() definition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for definition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCapabilityStatement_SupportedMessage withDefinition(Canonical value) {
    if (this.definition == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "definition");
    return new ImmutableCapabilityStatement_SupportedMessage(this.modifierExtension, this.mode, this.id, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_SupportedMessage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_SupportedMessage
        && equalTo((ImmutableCapabilityStatement_SupportedMessage) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_SupportedMessage another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(mode, another.mode)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && definition.equals(another.definition);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code mode}, {@code id}, {@code extension}, {@code definition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + definition.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_SupportedMessage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_SupportedMessage{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (mode != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 37) builder.append(", ");
    builder.append("definition=").append(definition);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_SupportedMessage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_SupportedMessage {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Capabilitystatement_supportedmessageMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Canonical definition;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<Capabilitystatement_supportedmessageMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
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
    @JsonProperty("definition")
    public void setDefinition(Canonical definition) {
      this.definition = definition;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Capabilitystatement_supportedmessageMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical definition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_SupportedMessage fromJson(Json json) {
    ImmutableCapabilityStatement_SupportedMessage.Builder builder = ((ImmutableCapabilityStatement_SupportedMessage.Builder) ImmutableCapabilityStatement_SupportedMessage.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.definition != null) {
      builder.definition(json.definition);
    }
    return (ImmutableCapabilityStatement_SupportedMessage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_SupportedMessage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_SupportedMessage instance
   */
  public static CapabilityStatement_SupportedMessage copyOf(CapabilityStatement_SupportedMessage instance) {
    if (instance instanceof ImmutableCapabilityStatement_SupportedMessage) {
      return (ImmutableCapabilityStatement_SupportedMessage) instance;
    }
    return ((ImmutableCapabilityStatement_SupportedMessage.Builder) ImmutableCapabilityStatement_SupportedMessage.builder())
        .modifierExtension(instance.modifierExtension())
        .mode(instance.mode())
        .id(instance.id())
        .extension(instance.extension())
        .definition(instance.definition())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_SupportedMessage CapabilityStatement_SupportedMessage}.
   * <pre>
   * ImmutableCapabilityStatement_SupportedMessage.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension}
   *    .mode(com.medplum.types.fhir.Capabilitystatement_supportedmessageMode) // optional {@link CapabilityStatement_SupportedMessage#mode() mode}
   *    .id(String) // optional {@link CapabilityStatement_SupportedMessage#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_SupportedMessage#extension() extension}
   *    .definition(com.medplum.types.fhir.Canonical) // required {@link CapabilityStatement_SupportedMessage#definition() definition}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_SupportedMessage builder
   */
  public static DefinitionBuildStage builder() {
    return new ImmutableCapabilityStatement_SupportedMessage.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_SupportedMessage CapabilityStatement_SupportedMessage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_SupportedMessage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements DefinitionBuildStage, BuildFinal {
    private static final long INIT_BIT_DEFINITION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Capabilitystatement_supportedmessageMode mode;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Canonical definition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Capabilitystatement_supportedmessageMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Capabilitystatement_supportedmessageMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#extension() extension} to extension.
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
     * Initializes the value for the {@link CapabilityStatement_SupportedMessage#definition() definition} attribute.
     * @param definition The value for definition 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Canonical definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      initBits &= ~INIT_BIT_DEFINITION;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_SupportedMessage CapabilityStatement_SupportedMessage}.
     * @return An immutable instance of CapabilityStatement_SupportedMessage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_SupportedMessage build() {
      checkRequiredAttributes();
      return new ImmutableCapabilityStatement_SupportedMessage(modifierExtension, mode, id, extension, definition);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean definitionIsSet() {
      return (initBits & INIT_BIT_DEFINITION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_SupportedMessage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!definitionIsSet()) attributes.add("definition");
      return "Cannot build CapabilityStatement_SupportedMessage, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CapabilityStatement_SupportedMessage", generator = "Immutables")
  public interface DefinitionBuildStage {
    /**
     * Initializes the value for the {@link CapabilityStatement_SupportedMessage#definition() definition} attribute.
     * @param definition The value for definition 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(Canonical definition);
  }

  @Generated(from = "CapabilityStatement_SupportedMessage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(Capabilitystatement_supportedmessageMode mode);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(Optional<? extends Capabilitystatement_supportedmessageMode> mode);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CapabilityStatement_SupportedMessage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link CapabilityStatement_SupportedMessage CapabilityStatement_SupportedMessage}.
     * @return An immutable instance of CapabilityStatement_SupportedMessage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CapabilityStatement_SupportedMessage build();
  }
}
