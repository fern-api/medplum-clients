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
 * Immutable implementation of {@link DocumentReference_RelatesTo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentReference_RelatesTo.builder()}.
 */
@Generated(from = "DocumentReference_RelatesTo", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentReference_RelatesTo
    implements DocumentReference_RelatesTo {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final Reference target;
  private final @Nullable Documentreference_RelatestoCode code;

  private ImmutableDocumentReference_RelatesTo(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      Reference target,
      @Nullable Documentreference_RelatestoCode code) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.target = target;
    this.code = code;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Reference target() {
    return target;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Documentreference_RelatestoCode> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_RelatesTo withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentReference_RelatesTo(newValue, this.extension, this.id, this.target, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_RelatesTo withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentReference_RelatesTo(value, this.extension, this.id, this.target, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_RelatesTo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_RelatesTo withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, newValue, this.id, this.target, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_RelatesTo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_RelatesTo withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, value, this.id, this.target, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_RelatesTo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_RelatesTo withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, this.extension, newValue, this.target, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_RelatesTo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_RelatesTo withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, this.extension, value, this.target, this.code);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DocumentReference_RelatesTo#target() target} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for target
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDocumentReference_RelatesTo withTarget(Reference value) {
    if (this.target == value) return this;
    Reference newValue = Objects.requireNonNull(value, "target");
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, this.extension, this.id, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_RelatesTo#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_RelatesTo withCode(Documentreference_RelatestoCode value) {
    @Nullable Documentreference_RelatestoCode newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, this.extension, this.id, this.target, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_RelatesTo#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_RelatesTo withCode(Optional<? extends Documentreference_RelatestoCode> optional) {
    @Nullable Documentreference_RelatestoCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDocumentReference_RelatesTo(this.modifierExtension, this.extension, this.id, this.target, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentReference_RelatesTo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentReference_RelatesTo
        && equalTo((ImmutableDocumentReference_RelatesTo) another);
  }

  private boolean equalTo(ImmutableDocumentReference_RelatesTo another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && target.equals(another.target)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code target}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + target.hashCode();
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentReference_RelatesTo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DocumentReference_RelatesTo{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("target=").append(target);
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DocumentReference_RelatesTo", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DocumentReference_RelatesTo {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference target;
    @Nullable Optional<Documentreference_RelatestoCode> code = Optional.empty();
    boolean codeIsSet;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Reference target) {
      this.target = target;
    }
    @JsonProperty("code")
    public void setCode(Optional<Documentreference_RelatestoCode> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Documentreference_RelatestoCode> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentReference_RelatesTo fromJson(Json json) {
    ImmutableDocumentReference_RelatesTo.Builder builder = ((ImmutableDocumentReference_RelatesTo.Builder) ImmutableDocumentReference_RelatesTo.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.target != null) {
      builder.target(json.target);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableDocumentReference_RelatesTo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DocumentReference_RelatesTo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DocumentReference_RelatesTo instance
   */
  public static DocumentReference_RelatesTo copyOf(DocumentReference_RelatesTo instance) {
    if (instance instanceof ImmutableDocumentReference_RelatesTo) {
      return (ImmutableDocumentReference_RelatesTo) instance;
    }
    return ((ImmutableDocumentReference_RelatesTo.Builder) ImmutableDocumentReference_RelatesTo.builder())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .target(instance.target())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentReference_RelatesTo DocumentReference_RelatesTo}.
   * <pre>
   * ImmutableDocumentReference_RelatesTo.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DocumentReference_RelatesTo#extension() extension}
   *    .id(String) // optional {@link DocumentReference_RelatesTo#id() id}
   *    .target(com.fhir.types.fhir.Reference) // required {@link DocumentReference_RelatesTo#target() target}
   *    .code(Documentreference_RelatestoCode) // optional {@link DocumentReference_RelatesTo#code() code}
   *    .build();
   * </pre>
   * @return A new DocumentReference_RelatesTo builder
   */
  public static TargetBuildStage builder() {
    return new ImmutableDocumentReference_RelatesTo.Builder();
  }

  /**
   * Builds instances of type {@link DocumentReference_RelatesTo DocumentReference_RelatesTo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DocumentReference_RelatesTo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TargetBuildStage, BuildFinal {
    private static final long INIT_BIT_TARGET = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Reference target;
    private @Nullable Documentreference_RelatestoCode code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference_RelatesTo#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference_RelatesTo#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference_RelatesTo#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference_RelatesTo#id() id} to id.
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
     * Initializes the value for the {@link DocumentReference_RelatesTo#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Reference target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      initBits &= ~INIT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Documentreference_RelatestoCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Documentreference_RelatestoCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link DocumentReference_RelatesTo DocumentReference_RelatesTo}.
     * @return An immutable instance of DocumentReference_RelatesTo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DocumentReference_RelatesTo build() {
      checkRequiredAttributes();
      return new ImmutableDocumentReference_RelatesTo(modifierExtension, extension, id, target, code);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean targetIsSet() {
      return (initBits & INIT_BIT_TARGET) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DocumentReference_RelatesTo is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!targetIsSet()) attributes.add("target");
      return "Cannot build DocumentReference_RelatesTo, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DocumentReference_RelatesTo", generator = "Immutables")
  public interface TargetBuildStage {
    /**
     * Initializes the value for the {@link DocumentReference_RelatesTo#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Reference target);
  }

  @Generated(from = "DocumentReference_RelatesTo", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(Documentreference_RelatestoCode code);

    /**
     * Initializes the optional value {@link DocumentReference_RelatesTo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends Documentreference_RelatestoCode> code);

    /**
     * Builds a new {@link DocumentReference_RelatesTo DocumentReference_RelatesTo}.
     * @return An immutable instance of DocumentReference_RelatesTo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DocumentReference_RelatesTo build();
  }
}
