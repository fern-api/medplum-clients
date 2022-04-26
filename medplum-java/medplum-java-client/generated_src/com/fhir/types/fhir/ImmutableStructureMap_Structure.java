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
 * Immutable implementation of {@link StructureMap_Structure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Structure.builder()}.
 */
@Generated(from = "StructureMap_Structure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Structure implements StructureMap_Structure {
  private final @Nullable List<Extension> extension;
  private final Canonical url;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Structuremap_StructureMode mode;
  private final @Nullable String documentation;
  private final @Nullable String alias;

  private ImmutableStructureMap_Structure(
      @Nullable List<Extension> extension,
      Canonical url,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Structuremap_StructureMode mode,
      @Nullable String documentation,
      @Nullable String alias) {
    this.extension = extension;
    this.url = url;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.mode = mode;
    this.documentation = documentation;
    this.alias = alias;
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Canonical url() {
    return url;
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
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Structuremap_StructureMode> mode() {
    return Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<String> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code alias} attribute
   */
  @JsonProperty("alias")
  @Override
  public Optional<String> alias() {
    return Optional.ofNullable(alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Structure(newValue, this.url, this.id, this.modifierExtension, this.mode, this.documentation, this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Structure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Structure(value, this.url, this.id, this.modifierExtension, this.mode, this.documentation, this.alias);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StructureMap_Structure#url() url} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for url
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStructureMap_Structure withUrl(Canonical value) {
    if (this.url == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "url");
    return new ImmutableStructureMap_Structure(
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.mode,
        this.documentation,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Structure(
        this.extension,
        this.url,
        newValue,
        this.modifierExtension,
        this.mode,
        this.documentation,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Structure(
        this.extension,
        this.url,
        value,
        this.modifierExtension,
        this.mode,
        this.documentation,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Structure(this.extension, this.url, this.id, newValue, this.mode, this.documentation, this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Structure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Structure(this.extension, this.url, this.id, value, this.mode, this.documentation, this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withMode(Structuremap_StructureMode value) {
    @Nullable Structuremap_StructureMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableStructureMap_Structure(
        this.extension,
        this.url,
        this.id,
        this.modifierExtension,
        newValue,
        this.documentation,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Structure withMode(Optional<? extends Structuremap_StructureMode> optional) {
    @Nullable Structuremap_StructureMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableStructureMap_Structure(
        this.extension,
        this.url,
        this.id,
        this.modifierExtension,
        value,
        this.documentation,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Structure(this.extension, this.url, this.id, this.modifierExtension, this.mode, newValue, this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Structure(this.extension, this.url, this.id, this.modifierExtension, this.mode, value, this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withAlias(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "alias");
    if (Objects.equals(this.alias, newValue)) return this;
    return new ImmutableStructureMap_Structure(
        this.extension,
        this.url,
        this.id,
        this.modifierExtension,
        this.mode,
        this.documentation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#alias() alias} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withAlias(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.alias, value)) return this;
    return new ImmutableStructureMap_Structure(this.extension, this.url, this.id, this.modifierExtension, this.mode, this.documentation, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Structure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Structure
        && equalTo((ImmutableStructureMap_Structure) another);
  }

  private boolean equalTo(ImmutableStructureMap_Structure another) {
    return Objects.equals(extension, another.extension)
        && url.equals(another.url)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(mode, another.mode)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(alias, another.alias);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code url}, {@code id}, {@code modifierExtension}, {@code mode}, {@code documentation}, {@code alias}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + url.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(alias);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Structure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Structure{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("url=").append(url);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (mode != null) {
      builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (documentation != null) {
      builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (alias != null) {
      builder.append(", ");
      builder.append("alias=").append(alias);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap_Structure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Structure {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Canonical url;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Structuremap_StructureMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<String> alias = Optional.empty();
    boolean aliasIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Canonical url) {
      this.url = url;
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
    @JsonProperty("mode")
    public void setMode(Optional<Structuremap_StructureMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("alias")
    public void setAlias(Optional<String> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Structuremap_StructureMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> alias() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Structure fromJson(Json json) {
    ImmutableStructureMap_Structure.Builder builder = ((ImmutableStructureMap_Structure.Builder) ImmutableStructureMap_Structure.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.url != null) {
      builder.url(json.url);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    return (ImmutableStructureMap_Structure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Structure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Structure instance
   */
  public static StructureMap_Structure copyOf(StructureMap_Structure instance) {
    if (instance instanceof ImmutableStructureMap_Structure) {
      return (ImmutableStructureMap_Structure) instance;
    }
    return ((ImmutableStructureMap_Structure.Builder) ImmutableStructureMap_Structure.builder())
        .extension(instance.extension())
        .url(instance.url())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .mode(instance.mode())
        .documentation(instance.documentation())
        .alias(instance.alias())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Structure StructureMap_Structure}.
   * <pre>
   * ImmutableStructureMap_Structure.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Structure#extension() extension}
   *    .url(com.fhir.types.fhir.Canonical) // required {@link StructureMap_Structure#url() url}
   *    .id(String) // optional {@link StructureMap_Structure#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Structure#modifierExtension() modifierExtension}
   *    .mode(Structuremap_StructureMode) // optional {@link StructureMap_Structure#mode() mode}
   *    .documentation(String) // optional {@link StructureMap_Structure#documentation() documentation}
   *    .alias(String) // optional {@link StructureMap_Structure#alias() alias}
   *    .build();
   * </pre>
   * @return A new StructureMap_Structure builder
   */
  public static UrlBuildStage builder() {
    return new ImmutableStructureMap_Structure.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Structure StructureMap_Structure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureMap_Structure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements UrlBuildStage, BuildFinal {
    private static final long INIT_BIT_URL = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODE = 0x8L;
    private static final long OPT_BIT_DOCUMENTATION = 0x10L;
    private static final long OPT_BIT_ALIAS = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Canonical url;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Structuremap_StructureMode mode;
    private @Nullable String documentation;
    private @Nullable String alias;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
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
     * Initializes the value for the {@link StructureMap_Structure#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Canonical url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      initBits &= ~INIT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Structuremap_StructureMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Structuremap_StructureMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(String alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alias")
    public final Builder alias(Optional<String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Structure StructureMap_Structure}.
     * @return An immutable instance of StructureMap_Structure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap_Structure build() {
      checkRequiredAttributes();
      return new ImmutableStructureMap_Structure(extension, url, id, modifierExtension, mode, documentation, alias);
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

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean urlIsSet() {
      return (initBits & INIT_BIT_URL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Structure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!urlIsSet()) attributes.add("url");
      return "Cannot build StructureMap_Structure, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "StructureMap_Structure", generator = "Immutables")
  public interface UrlBuildStage {
    /**
     * Initializes the value for the {@link StructureMap_Structure#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Canonical url);
  }

  @Generated(from = "StructureMap_Structure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(Structuremap_StructureMode mode);

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(Optional<? extends Structuremap_StructureMode> mode);

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal documentation(String documentation);

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal documentation(Optional<String> documentation);

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(String alias);

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(Optional<String> alias);

    /**
     * Builds a new {@link StructureMap_Structure StructureMap_Structure}.
     * @return An immutable instance of StructureMap_Structure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    StructureMap_Structure build();
  }
}
