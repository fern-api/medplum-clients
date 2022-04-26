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
 * Immutable implementation of {@link ImplementationGuide_Resource1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Resource1.builder()}.
 */
@Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Resource1
    implements ImplementationGuide_Resource1 {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final Reference reference;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Url relativePath;
  private final @Nullable Boolean exampleBoolean;
  private final @Nullable String exampleCanonical;

  private ImmutableImplementationGuide_Resource1(
      @Nullable String id,
      @Nullable List<Extension> extension,
      Reference reference,
      @Nullable List<Extension> modifierExtension,
      @Nullable Url relativePath,
      @Nullable Boolean exampleBoolean,
      @Nullable String exampleCanonical) {
    this.id = id;
    this.extension = extension;
    this.reference = reference;
    this.modifierExtension = modifierExtension;
    this.relativePath = relativePath;
    this.exampleBoolean = exampleBoolean;
    this.exampleCanonical = exampleCanonical;
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
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Reference reference() {
    return reference;
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
   * @return The value of the {@code relativePath} attribute
   */
  @JsonProperty("relativePath")
  @Override
  public Optional<Url> relativePath() {
    return Optional.ofNullable(relativePath);
  }

  /**
   * @return The value of the {@code exampleBoolean} attribute
   */
  @JsonProperty("exampleBoolean")
  @Override
  public Optional<Boolean> exampleBoolean() {
    return Optional.ofNullable(exampleBoolean);
  }

  /**
   * @return The value of the {@code exampleCanonical} attribute
   */
  @JsonProperty("exampleCanonical")
  @Override
  public Optional<String> exampleCanonical() {
    return Optional.ofNullable(exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Resource1(
        newValue,
        this.extension,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Resource1(
        value,
        this.extension,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        newValue,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        value,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide_Resource1#reference() reference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withReference(Reference value) {
    if (this.reference == value) return this;
    Reference newValue = Objects.requireNonNull(value, "reference");
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        newValue,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        newValue,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        value,
        this.relativePath,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#relativePath() relativePath} attribute.
   * @param value The value for relativePath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withRelativePath(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "relativePath");
    if (this.relativePath == newValue) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.modifierExtension,
        newValue,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#relativePath() relativePath} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relativePath
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource1 withRelativePath(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.relativePath == value) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.modifierExtension,
        value,
        this.exampleBoolean,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} attribute.
   * @param value The value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.exampleBoolean, newValue)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        newValue,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.exampleBoolean, value)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        value,
        this.exampleCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} attribute.
   * @param value The value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "exampleCanonical");
    if (Objects.equals(this.exampleCanonical, newValue)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.exampleCanonical, value)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.modifierExtension,
        this.relativePath,
        this.exampleBoolean,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Resource1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Resource1
        && equalTo((ImmutableImplementationGuide_Resource1) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Resource1 another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && reference.equals(another.reference)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(relativePath, another.relativePath)
        && Objects.equals(exampleBoolean, another.exampleBoolean)
        && Objects.equals(exampleCanonical, another.exampleCanonical);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code reference}, {@code modifierExtension}, {@code relativePath}, {@code exampleBoolean}, {@code exampleCanonical}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(relativePath);
    h += (h << 5) + Objects.hashCode(exampleBoolean);
    h += (h << 5) + Objects.hashCode(exampleCanonical);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Resource1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Resource1{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("reference=").append(reference);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (relativePath != null) {
      builder.append(", ");
      builder.append("relativePath=").append(relativePath);
    }
    if (exampleBoolean != null) {
      builder.append(", ");
      builder.append("exampleBoolean=").append(exampleBoolean);
    }
    if (exampleCanonical != null) {
      builder.append(", ");
      builder.append("exampleCanonical=").append(exampleCanonical);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Resource1 {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference reference;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Url> relativePath = Optional.empty();
    boolean relativePathIsSet;
    @Nullable Optional<Boolean> exampleBoolean = Optional.empty();
    boolean exampleBooleanIsSet;
    @Nullable Optional<String> exampleCanonical = Optional.empty();
    boolean exampleCanonicalIsSet;
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
    @JsonProperty("reference")
    public void setReference(Reference reference) {
      this.reference = reference;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("relativePath")
    public void setRelativePath(Optional<Url> relativePath) {
      this.relativePath = relativePath;
      this.relativePathIsSet = true;
    }
    @JsonProperty("exampleBoolean")
    public void setExampleBoolean(Optional<Boolean> exampleBoolean) {
      this.exampleBoolean = exampleBoolean;
      this.exampleBooleanIsSet = true;
    }
    @JsonProperty("exampleCanonical")
    public void setExampleCanonical(Optional<String> exampleCanonical) {
      this.exampleCanonical = exampleCanonical;
      this.exampleCanonicalIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> relativePath() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> exampleBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> exampleCanonical() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Resource1 fromJson(Json json) {
    ImmutableImplementationGuide_Resource1.Builder builder = ((ImmutableImplementationGuide_Resource1.Builder) ImmutableImplementationGuide_Resource1.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reference != null) {
      builder.reference(json.reference);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.relativePathIsSet) {
      builder.relativePath(json.relativePath);
    }
    if (json.exampleBooleanIsSet) {
      builder.exampleBoolean(json.exampleBoolean);
    }
    if (json.exampleCanonicalIsSet) {
      builder.exampleCanonical(json.exampleCanonical);
    }
    return (ImmutableImplementationGuide_Resource1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Resource1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Resource1 instance
   */
  public static ImplementationGuide_Resource1 copyOf(ImplementationGuide_Resource1 instance) {
    if (instance instanceof ImmutableImplementationGuide_Resource1) {
      return (ImmutableImplementationGuide_Resource1) instance;
    }
    return ((ImmutableImplementationGuide_Resource1.Builder) ImmutableImplementationGuide_Resource1.builder())
        .id(instance.id())
        .extension(instance.extension())
        .reference(instance.reference())
        .modifierExtension(instance.modifierExtension())
        .relativePath(instance.relativePath())
        .exampleBoolean(instance.exampleBoolean())
        .exampleCanonical(instance.exampleCanonical())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
   * <pre>
   * ImmutableImplementationGuide_Resource1.builder()
   *    .id(String) // optional {@link ImplementationGuide_Resource1#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource1#extension() extension}
   *    .reference(com.medplum.types.fhir.Reference) // required {@link ImplementationGuide_Resource1#reference() reference}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension}
   *    .relativePath(com.medplum.types.fhir.Url) // optional {@link ImplementationGuide_Resource1#relativePath() relativePath}
   *    .exampleBoolean(Boolean) // optional {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean}
   *    .exampleCanonical(String) // optional {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Resource1 builder
   */
  public static ReferenceBuildStage builder() {
    return new ImmutableImplementationGuide_Resource1.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ReferenceBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_RELATIVE_PATH = 0x8L;
    private static final long OPT_BIT_EXAMPLE_BOOLEAN = 0x10L;
    private static final long OPT_BIT_EXAMPLE_CANONICAL = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Reference reference;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Url relativePath;
    private @Nullable Boolean exampleBoolean;
    private @Nullable String exampleCanonical;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
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
     * Initializes the value for the {@link ImplementationGuide_Resource1#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for chained invocation
     */
    public final Builder relativePath(Url relativePath) {
      checkNotIsSet(relativePathIsSet(), "relativePath");
      this.relativePath = Objects.requireNonNull(relativePath, "relativePath");
      optBits |= OPT_BIT_RELATIVE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relativePath")
    public final Builder relativePath(Optional<? extends Url> relativePath) {
      checkNotIsSet(relativePathIsSet(), "relativePath");
      this.relativePath = relativePath.orElse(null);
      optBits |= OPT_BIT_RELATIVE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleBoolean(boolean exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean;
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exampleBoolean")
    public final Builder exampleBoolean(Optional<Boolean> exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleCanonical(String exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = Objects.requireNonNull(exampleCanonical, "exampleCanonical");
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exampleCanonical")
    public final Builder exampleCanonical(Optional<String> exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = exampleCanonical.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Builds a new {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
     * @return An immutable instance of ImplementationGuide_Resource1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Resource1 build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide_Resource1(id, extension, reference, modifierExtension, relativePath, exampleBoolean, exampleCanonical);
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

    private boolean relativePathIsSet() {
      return (optBits & OPT_BIT_RELATIVE_PATH) != 0;
    }

    private boolean exampleBooleanIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_BOOLEAN) != 0;
    }

    private boolean exampleCanonicalIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_CANONICAL) != 0;
    }

    private boolean referenceIsSet() {
      return (initBits & INIT_BIT_REFERENCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Resource1 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!referenceIsSet()) attributes.add("reference");
      return "Cannot build ImplementationGuide_Resource1, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  public interface ReferenceBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide_Resource1#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(Reference reference);
  }

  @Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relativePath(Url relativePath);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relativePath(Optional<? extends Url> relativePath);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleBoolean(boolean exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleBoolean(Optional<Boolean> exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleCanonical(String exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleCanonical(Optional<String> exampleCanonical);

    /**
     * Builds a new {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
     * @return An immutable instance of ImplementationGuide_Resource1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide_Resource1 build();
  }
}
