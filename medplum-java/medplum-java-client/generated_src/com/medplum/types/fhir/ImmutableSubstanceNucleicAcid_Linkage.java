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
 * Immutable implementation of {@link SubstanceNucleicAcid_Linkage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceNucleicAcid_Linkage.builder()}.
 */
@Generated(from = "SubstanceNucleicAcid_Linkage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceNucleicAcid_Linkage
    implements SubstanceNucleicAcid_Linkage {
  private final @Nullable Identifier identifier;
  private final @Nullable String name;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String connectivity;
  private final @Nullable String id;
  private final @Nullable String residueSite;
  private final @Nullable List<Extension> extension;

  private ImmutableSubstanceNucleicAcid_Linkage(
      @Nullable Identifier identifier,
      @Nullable String name,
      @Nullable List<Extension> modifierExtension,
      @Nullable String connectivity,
      @Nullable String id,
      @Nullable String residueSite,
      @Nullable List<Extension> extension) {
    this.identifier = identifier;
    this.name = name;
    this.modifierExtension = modifierExtension;
    this.connectivity = connectivity;
    this.id = id;
    this.residueSite = residueSite;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code connectivity} attribute
   */
  @JsonProperty("connectivity")
  @Override
  public Optional<String> connectivity() {
    return Optional.ofNullable(connectivity);
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
   * @return The value of the {@code residueSite} attribute
   */
  @JsonProperty("residueSite")
  @Override
  public Optional<String> residueSite() {
    return Optional.ofNullable(residueSite);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        newValue,
        this.name,
        this.modifierExtension,
        this.connectivity,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Linkage withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        value,
        this.name,
        this.modifierExtension,
        this.connectivity,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        newValue,
        this.modifierExtension,
        this.connectivity,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        value,
        this.modifierExtension,
        this.connectivity,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        newValue,
        this.connectivity,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Linkage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(this.identifier, this.name, value, this.connectivity, this.id, this.residueSite, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#connectivity() connectivity} attribute.
   * @param value The value for connectivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withConnectivity(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "connectivity");
    if (Objects.equals(this.connectivity, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        newValue,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#connectivity() connectivity} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for connectivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withConnectivity(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.connectivity, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        value,
        this.id,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        this.connectivity,
        newValue,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        this.connectivity,
        value,
        this.residueSite,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#residueSite() residueSite} attribute.
   * @param value The value for residueSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withResidueSite(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "residueSite");
    if (Objects.equals(this.residueSite, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        this.connectivity,
        this.id,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#residueSite() residueSite} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for residueSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withResidueSite(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.residueSite, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        this.connectivity,
        this.id,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Linkage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Linkage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        this.connectivity,
        this.id,
        this.residueSite,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Linkage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Linkage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceNucleicAcid_Linkage(
        this.identifier,
        this.name,
        this.modifierExtension,
        this.connectivity,
        this.id,
        this.residueSite,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceNucleicAcid_Linkage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceNucleicAcid_Linkage
        && equalTo((ImmutableSubstanceNucleicAcid_Linkage) another);
  }

  private boolean equalTo(ImmutableSubstanceNucleicAcid_Linkage another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(name, another.name)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(connectivity, another.connectivity)
        && Objects.equals(id, another.id)
        && Objects.equals(residueSite, another.residueSite)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code name}, {@code modifierExtension}, {@code connectivity}, {@code id}, {@code residueSite}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(connectivity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(residueSite);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceNucleicAcid_Linkage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceNucleicAcid_Linkage{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (name != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (connectivity != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("connectivity=").append(connectivity);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (residueSite != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("residueSite=").append(residueSite);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceNucleicAcid_Linkage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceNucleicAcid_Linkage {
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> connectivity = Optional.empty();
    boolean connectivityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> residueSite = Optional.empty();
    boolean residueSiteIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("connectivity")
    public void setConnectivity(Optional<String> connectivity) {
      this.connectivity = connectivity;
      this.connectivityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("residueSite")
    public void setResidueSite(Optional<String> residueSite) {
      this.residueSite = residueSite;
      this.residueSiteIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> connectivity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> residueSite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceNucleicAcid_Linkage fromJson(Json json) {
    ImmutableSubstanceNucleicAcid_Linkage.Builder builder = ImmutableSubstanceNucleicAcid_Linkage.builder();
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.connectivityIsSet) {
      builder.connectivity(json.connectivity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.residueSiteIsSet) {
      builder.residueSite(json.residueSite);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstanceNucleicAcid_Linkage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceNucleicAcid_Linkage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceNucleicAcid_Linkage instance
   */
  public static SubstanceNucleicAcid_Linkage copyOf(SubstanceNucleicAcid_Linkage instance) {
    if (instance instanceof ImmutableSubstanceNucleicAcid_Linkage) {
      return (ImmutableSubstanceNucleicAcid_Linkage) instance;
    }
    return ImmutableSubstanceNucleicAcid_Linkage.builder()
        .identifier(instance.identifier())
        .name(instance.name())
        .modifierExtension(instance.modifierExtension())
        .connectivity(instance.connectivity())
        .id(instance.id())
        .residueSite(instance.residueSite())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceNucleicAcid_Linkage SubstanceNucleicAcid_Linkage}.
   * <pre>
   * ImmutableSubstanceNucleicAcid_Linkage.builder()
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link SubstanceNucleicAcid_Linkage#identifier() identifier}
   *    .name(String) // optional {@link SubstanceNucleicAcid_Linkage#name() name}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid_Linkage#modifierExtension() modifierExtension}
   *    .connectivity(String) // optional {@link SubstanceNucleicAcid_Linkage#connectivity() connectivity}
   *    .id(String) // optional {@link SubstanceNucleicAcid_Linkage#id() id}
   *    .residueSite(String) // optional {@link SubstanceNucleicAcid_Linkage#residueSite() residueSite}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid_Linkage#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstanceNucleicAcid_Linkage builder
   */
  public static ImmutableSubstanceNucleicAcid_Linkage.Builder builder() {
    return new ImmutableSubstanceNucleicAcid_Linkage.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceNucleicAcid_Linkage SubstanceNucleicAcid_Linkage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceNucleicAcid_Linkage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_CONNECTIVITY = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_RESIDUE_SITE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable Identifier identifier;
    private @Nullable String name;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String connectivity;
    private @Nullable String id;
    private @Nullable String residueSite;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#name() name} to name.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#name() name} to name.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#connectivity() connectivity} to connectivity.
     * @param connectivity The value for connectivity
     * @return {@code this} builder for chained invocation
     */
    public final Builder connectivity(String connectivity) {
      checkNotIsSet(connectivityIsSet(), "connectivity");
      this.connectivity = Objects.requireNonNull(connectivity, "connectivity");
      optBits |= OPT_BIT_CONNECTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#connectivity() connectivity} to connectivity.
     * @param connectivity The value for connectivity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("connectivity")
    public final Builder connectivity(Optional<String> connectivity) {
      checkNotIsSet(connectivityIsSet(), "connectivity");
      this.connectivity = connectivity.orElse(null);
      optBits |= OPT_BIT_CONNECTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#residueSite() residueSite} to residueSite.
     * @param residueSite The value for residueSite
     * @return {@code this} builder for chained invocation
     */
    public final Builder residueSite(String residueSite) {
      checkNotIsSet(residueSiteIsSet(), "residueSite");
      this.residueSite = Objects.requireNonNull(residueSite, "residueSite");
      optBits |= OPT_BIT_RESIDUE_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#residueSite() residueSite} to residueSite.
     * @param residueSite The value for residueSite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("residueSite")
    public final Builder residueSite(Optional<String> residueSite) {
      checkNotIsSet(residueSiteIsSet(), "residueSite");
      this.residueSite = residueSite.orElse(null);
      optBits |= OPT_BIT_RESIDUE_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Linkage#extension() extension} to extension.
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
     * Builds a new {@link SubstanceNucleicAcid_Linkage SubstanceNucleicAcid_Linkage}.
     * @return An immutable instance of SubstanceNucleicAcid_Linkage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceNucleicAcid_Linkage build() {
      return new ImmutableSubstanceNucleicAcid_Linkage(identifier, name, modifierExtension, connectivity, id, residueSite, extension);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean connectivityIsSet() {
      return (optBits & OPT_BIT_CONNECTIVITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean residueSiteIsSet() {
      return (optBits & OPT_BIT_RESIDUE_SITE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceNucleicAcid_Linkage is strict, attribute is already set: ".concat(name));
    }
  }
}
