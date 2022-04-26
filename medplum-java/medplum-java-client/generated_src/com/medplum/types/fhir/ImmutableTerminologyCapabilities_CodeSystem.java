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
 * Immutable implementation of {@link TerminologyCapabilities_CodeSystem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_CodeSystem.builder()}.
 */
@Generated(from = "TerminologyCapabilities_CodeSystem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_CodeSystem
    implements TerminologyCapabilities_CodeSystem {
  private final @Nullable Canonical uri;
  private final @Nullable Boolean subsumption;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<TerminologyCapabilities_Version> version;

  private ImmutableTerminologyCapabilities_CodeSystem(
      @Nullable Canonical uri,
      @Nullable Boolean subsumption,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<TerminologyCapabilities_Version> version) {
    this.uri = uri;
    this.subsumption = subsumption;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.version = version;
  }

  /**
   * @return The value of the {@code uri} attribute
   */
  @JsonProperty("uri")
  @Override
  public Optional<Canonical> uri() {
    return Optional.ofNullable(uri);
  }

  /**
   * @return The value of the {@code subsumption} attribute
   */
  @JsonProperty("subsumption")
  @Override
  public Optional<Boolean> subsumption() {
    return Optional.ofNullable(subsumption);
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
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<List<TerminologyCapabilities_Version>> version() {
    return Optional.ofNullable(version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#uri() uri} attribute.
   * @param value The value for uri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withUri(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "uri");
    if (this.uri == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(newValue, this.subsumption, this.modifierExtension, this.id, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#uri() uri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withUri(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.uri == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(value, this.subsumption, this.modifierExtension, this.id, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} attribute.
   * @param value The value for subsumption
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withSubsumption(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.subsumption, newValue)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, newValue, this.modifierExtension, this.id, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subsumption
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withSubsumption(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.subsumption, value)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, value, this.modifierExtension, this.id, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, newValue, this.id, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, value, this.id, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, this.modifierExtension, newValue, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, this.modifierExtension, value, this.extension, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, this.modifierExtension, this.id, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, this.modifierExtension, this.id, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withVersion(List<TerminologyCapabilities_Version> value) {
    @Nullable List<TerminologyCapabilities_Version> newValue = Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, this.modifierExtension, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withVersion(Optional<? extends List<TerminologyCapabilities_Version>> optional) {
    @Nullable List<TerminologyCapabilities_Version> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.uri, this.subsumption, this.modifierExtension, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_CodeSystem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_CodeSystem
        && equalTo((ImmutableTerminologyCapabilities_CodeSystem) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_CodeSystem another) {
    return Objects.equals(uri, another.uri)
        && Objects.equals(subsumption, another.subsumption)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(version, another.version);
  }

  /**
   * Computes a hash code from attributes: {@code uri}, {@code subsumption}, {@code modifierExtension}, {@code id}, {@code extension}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(uri);
    h += (h << 5) + Objects.hashCode(subsumption);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(version);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_CodeSystem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TerminologyCapabilities_CodeSystem{");
    if (uri != null) {
      builder.append("uri=").append(uri);
    }
    if (subsumption != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("subsumption=").append(subsumption);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (version != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("version=").append(version);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TerminologyCapabilities_CodeSystem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TerminologyCapabilities_CodeSystem {
    @Nullable Optional<Canonical> uri = Optional.empty();
    boolean uriIsSet;
    @Nullable Optional<Boolean> subsumption = Optional.empty();
    boolean subsumptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<TerminologyCapabilities_Version>> version = Optional.empty();
    boolean versionIsSet;
    @JsonProperty("uri")
    public void setUri(Optional<Canonical> uri) {
      this.uri = uri;
      this.uriIsSet = true;
    }
    @JsonProperty("subsumption")
    public void setSubsumption(Optional<Boolean> subsumption) {
      this.subsumption = subsumption;
      this.subsumptionIsSet = true;
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
    @JsonProperty("version")
    public void setVersion(Optional<List<TerminologyCapabilities_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @Override
    public Optional<Canonical> uri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> subsumption() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TerminologyCapabilities_Version>> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities_CodeSystem fromJson(Json json) {
    ImmutableTerminologyCapabilities_CodeSystem.Builder builder = ImmutableTerminologyCapabilities_CodeSystem.builder();
    if (json.uriIsSet) {
      builder.uri(json.uri);
    }
    if (json.subsumptionIsSet) {
      builder.subsumption(json.subsumption);
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
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    return (ImmutableTerminologyCapabilities_CodeSystem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_CodeSystem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_CodeSystem instance
   */
  public static TerminologyCapabilities_CodeSystem copyOf(TerminologyCapabilities_CodeSystem instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_CodeSystem) {
      return (ImmutableTerminologyCapabilities_CodeSystem) instance;
    }
    return ImmutableTerminologyCapabilities_CodeSystem.builder()
        .uri(instance.uri())
        .subsumption(instance.subsumption())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .version(instance.version())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_CodeSystem TerminologyCapabilities_CodeSystem}.
   * <pre>
   * ImmutableTerminologyCapabilities_CodeSystem.builder()
   *    .uri(com.medplum.types.fhir.Canonical) // optional {@link TerminologyCapabilities_CodeSystem#uri() uri}
   *    .subsumption(Boolean) // optional {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link TerminologyCapabilities_CodeSystem#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_CodeSystem#extension() extension}
   *    .version(List&amp;lt;com.medplum.types.fhir.TerminologyCapabilities_Version&amp;gt;) // optional {@link TerminologyCapabilities_CodeSystem#version() version}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_CodeSystem builder
   */
  public static ImmutableTerminologyCapabilities_CodeSystem.Builder builder() {
    return new ImmutableTerminologyCapabilities_CodeSystem.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_CodeSystem TerminologyCapabilities_CodeSystem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TerminologyCapabilities_CodeSystem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_URI = 0x1L;
    private static final long OPT_BIT_SUBSUMPTION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_VERSION = 0x20L;
    private long optBits;

    private @Nullable Canonical uri;
    private @Nullable Boolean subsumption;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<TerminologyCapabilities_Version> version;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for chained invocation
     */
    public final Builder uri(Canonical uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = Objects.requireNonNull(uri, "uri");
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("uri")
    public final Builder uri(Optional<? extends Canonical> uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = uri.orElse(null);
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} to subsumption.
     * @param subsumption The value for subsumption
     * @return {@code this} builder for chained invocation
     */
    public final Builder subsumption(boolean subsumption) {
      checkNotIsSet(subsumptionIsSet(), "subsumption");
      this.subsumption = subsumption;
      optBits |= OPT_BIT_SUBSUMPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} to subsumption.
     * @param subsumption The value for subsumption
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subsumption")
    public final Builder subsumption(Optional<Boolean> subsumption) {
      checkNotIsSet(subsumptionIsSet(), "subsumption");
      this.subsumption = subsumption.orElse(null);
      optBits |= OPT_BIT_SUBSUMPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(List<TerminologyCapabilities_Version> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<? extends List<TerminologyCapabilities_Version>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link TerminologyCapabilities_CodeSystem TerminologyCapabilities_CodeSystem}.
     * @return An immutable instance of TerminologyCapabilities_CodeSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TerminologyCapabilities_CodeSystem build() {
      return new ImmutableTerminologyCapabilities_CodeSystem(uri, subsumption, modifierExtension, id, extension, version);
    }

    private boolean uriIsSet() {
      return (optBits & OPT_BIT_URI) != 0;
    }

    private boolean subsumptionIsSet() {
      return (optBits & OPT_BIT_SUBSUMPTION) != 0;
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

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TerminologyCapabilities_CodeSystem is strict, attribute is already set: ".concat(name));
    }
  }
}
